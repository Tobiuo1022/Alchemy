package recipe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Alchemist alchemist = new Alchemist();
        Paper paper = new Paper();
        alchemist.prepare(); //素材の用意

        System.out.println("調べたい素材の名前を入力して下さい。");
        Material target = null;
        choose:
        while(target == null) {
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();
            for(int i=0; i<alchemist.materials.size(); i++) {
                if(name.equals(alchemist.materials.get(i).name)) {
                    target = alchemist.materials.get(i);
                    break choose;
                }
            }
            System.out.println("素材の名前が間違っています。");
        }

        System.out.printf("-- %sの効果 --\n", target.name);
        paper.pri_mat_eff(target); //素材の効果の出力

        System.out.printf("\n-- %sと相性の良い素材 --\n", target.name);
        for(int i=0; i < alchemist.materials.size(); i++) { //総当たりで調合
            Material sec_mat = alchemist.materials.get(i); //2つ目の素材
            Potion potion = alchemist.compounding2(target, sec_mat); //調合
            if(Math.abs(potion.mix) >= 2) { //相性の良い素材との組み合わせのみを抽出する
                System.out.printf("●%s + %s\n", target.name, sec_mat.name);
                System.out.printf("  %s:\n", potion.type);
                paper.pri_pot_eff(potion); //ポーションの効果の出力
                paper.pri_pot_hid_eff(potion); //ポーションの潜在効果の出力
                target.partner.add(sec_mat); //target.partnerにsec_matを相性の良い素材として記憶.
            }
        }

        System.out.printf("\n-- %sから作れる有用なポーション --\n", target.name);
        choose_sec_mat:
        for(int i=0; i < alchemist.materials.size(); i++) { //総当たりで調合
            Material sec_mat = alchemist.materials.get(i); //2つ目の素材の設定
            for (int a=0; a < target.partner.size(); a++)
                if (sec_mat.name.equals(target.partner.get(a).name))
                    continue choose_sec_mat; //2つ目の素材がtarget.partnerに設定されていた場合,この調合は省略する.

            choose_thi_mat:
            for (int j = i+1; j < alchemist.materials.size(); j++) {
                Material thi_mat = alchemist.materials.get(j); //3つ目の素材の設定
                for (int a=0; a < target.partner.size(); a++)
                    if (thi_mat.name.equals(target.partner.get(a).name))
                        continue choose_thi_mat; //3つ目の素材がtarget.partnerに設定されていた場合,この調合は省略する.

                Potion potion = alchemist.compounding3(target, sec_mat, thi_mat); //調合

                int count = 0;
                for (int k=0; k < target.effects.size(); k++) {
                    for (int l=0; l < potion.effects.size(); l++) {
                        if (target.effects.get(k).equals(potion.effects.get(l))) {
                            count += 1;
                        }
                    }
                }
                if(Math.abs(potion.mix) == 3 && count >= 2) { //有用なポーションのみを抽出する
                    System.out.printf("●%s + %s + %s\n", target.name, sec_mat.name, thi_mat.name);
                    System.out.printf("  %s:\n", potion.type);
                    paper.pri_pot_eff(potion); //ポーションの効果の出力
                }
            }
        }

        System.out.printf("\n-- %sから作れる特に有用なポーション --\n", target.name);
        for(int i=0; i < alchemist.materials.size(); i++) { //総当たりで調合
            Material sec_mat = alchemist.materials.get(i); //2つ目の素材の設定
            for (int j = i+1; j < alchemist.materials.size(); j++) {
                Material thi_mat = alchemist.materials.get(j); //3つ目の素材の設定
                Potion potion = alchemist.compounding3(target, sec_mat, thi_mat); //調合
                if(Math.abs(potion.mix) > 3) { //有用なポーションのみを抽出する
                    System.out.printf("●%s + %s + %s\n", target.name, sec_mat.name, thi_mat.name);
                    System.out.printf("  %s:\n", potion.type);
                    paper.pri_pot_eff(potion); //ポーションの効果の出力
                }
            }
        }

        System.out.println("\n-- 高純度だと有用なポーション --");
        for(int i=0; i < alchemist.materials.size(); i++) { //総当たりで調合
            Material sec_mat = alchemist.materials.get(i); //2つ目の素材の設定
            for (int j = i+1; j < alchemist.materials.size(); j++) {
                Material thi_mat = alchemist.materials.get(j); //3つ目の素材の設定
                Potion potion = alchemist.compounding3(target, sec_mat, thi_mat); //調合
                if(potion.goodness >= 1 && potion.badness >= 1) {
                    if (potion.goodness >= 3 || potion.badness >= 3) { //有用なポーションのみを抽出する
                        System.out.printf("●%s + %s + %s\n", target.name, sec_mat.name, thi_mat.name);
                        System.out.printf("  %s:\n", potion.type);
                        paper.pri_pot_eff(potion); //ポーションの効果の出力
                    }
                }
            }
        }
    }
}
