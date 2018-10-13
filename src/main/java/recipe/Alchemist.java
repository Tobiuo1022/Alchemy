package recipe;

import java.util.*;

public class Alchemist {
    public List<Material> materials;

    /**
     * コンストラクタ
     */
    public Alchemist() {
        materials = new ArrayList<>();
    }

    /**
     * 素材の用意
     */
    public void prepare() {
        materials.add(new Material("アビシアン・ロングフィン", 162, 82, 165,42));
        materials.add(new Material("イワムシクイの卵", 11, 71, 125,164));
        materials.add(new Material("ウィスプ・ラッピング", 21, 41, 98,55));
        materials.add(new Material("エクトプラズム", 31, 41, 33,115));
        materials.add(new Material("エルフイヤー・リーフ", 31, 73, 162,51));
        materials.add(new Material("オレンジ・ダートウィング", 21, 134, 81,116));
        materials.add(new Material("カニスの根", 125, 71, 73,192));
        materials.add(new Material("クマの爪", 21, 13, 71,137));
        materials.add(new Material("クモの卵", 125, 137, 83,73));
        materials.add(new Material("グラス・ポッド", 55, 134, 44,31));
        materials.add(new Material("クリープ・クラスター", 31, 127, 98,164));
        materials.add(new Material("クリムゾン・ニルンルート", 115, 125, 97,54));
        materials.add(new Material("サーベルキャットの牙", 21, 75, 84,165));
        materials.add(new Material("サーベルキャットの目", 21, 114, 135,11));
        materials.add(new Material("シッスルの枝", 52, 124, 55,75));
        materials.add(new Material("シャウラスの卵", 165, 23, 135,97));
        materials.add(new Material("ジャズベイ・ブドウ", 164, 33, 32,114));
        materials.add(new Material("ジュニパーベリー", 161, 73, 12,127));
        materials.add(new Material("シルバーサイド・パーチ", 21, 127, 114,52));
        materials.add(new Material("シロディールのスペードテール", 125, 42, 193,114));
        materials.add(new Material("スキーヴァーの尻尾", 127, 114, 115,74));
        materials.add(new Material("スギタケ", 164, 43, 22,98));
        materials.add(new Material("スノーベリー", 51, 85, 52,53));
        materials.add(new Material("スプリガンの樹液", 127, 85, 84,44));
        materials.add(new Material("スローターフィッシュの卵", 55, 81, 116,23));
        materials.add(new Material("スローターフィッシュの鱗", 52, 116, 75,76));
        materials.add(new Material("ツンドラの綿", 54, 33, 76,86));
        materials.add(new Material("デイドラの心臓", 11, 127, 135,193));
        materials.add(new Material("デスベル", 115, 124, 194,165));
        materials.add(new Material("トロールの脂肪", 55, 72, 195,115));
        materials.add(new Material("ドワーフのオイル", 164, 43, 32,31));
        materials.add(new Material("ナミラキノコ", 135, 83, 193,12));
        materials.add(new Material("ニルンルート", 115, 125, 97,54));
        materials.add(new Material("ニンニク", 55, 23, 32,12));
        materials.add(new Material("ノルド・フジツボ", 135, 96, 12,81));
        materials.add(new Material("パール", 21, 76, 31,53));
        materials.add(new Material("パール（小）", 21, 71, 42,52));
        materials.add(new Material("パイン・スラッシュの卵", 21, 83, 165,53));
        materials.add(new Material("ハグレイヴンの羽", 135, 45, 195,163));
        materials.add(new Material("ハグレイヴンの爪", 54, 137, 85,86));
        materials.add(new Material("ハチ", 21, 124, 22,163));
        materials.add(new Material("ハチの巣", 21, 76, 74,124));
        materials.add(new Material("ハチの巣の殻", 55, 74, 82,41));
        materials.add(new Material("ヒストカープ", 21, 33, 127,96));
        materials.add(new Material("ファルメルの耳", 115, 195, 55,83));
        materials.add(new Material("ブライア・ハート", 31, 76, 192,33));
        materials.add(new Material("ブリスターワート", 125, 195, 11,84));
        materials.add(new Material("ブルー・ダートウィング", 53, 81, 11,193));
        materials.add(new Material("フロスト・ミリアム", 52, 82, 134,127));
        materials.add(new Material("ベニテングダケ", 51, 72, 195,22));
        materials.add(new Material("ベラドンナ", 115, 137, 126,41));
        materials.add(new Material("ホタルの腹部", 21, 136, 164,23));
        materials.add(new Material("マッドクラブの殻", 21, 91, 55,51));
        materials.add(new Material("マンモスの牙粉", 21, 82, 161,193));
        materials.add(new Material("ムーンシュガー", 161, 52, 31,32));
        materials.add(new Material("モラ・タピネラ", 31, 116, 22,43));
        materials.add(new Material("ラベンダー", 54, 23, 134,45));
        materials.add(new Material("リバー・ベティ", 115, 44, 194,98));
        materials.add(new Material("リュウノシタ", 51, 86, 43,72));
        materials.add(new Material("ルナ・モスの羽", 135, 74, 12,97));
        materials.add(new Material("炎の塩鉱石", 162, 51, 31,32));
        materials.add(new Material("塩", 164, 42, 194,32));
        materials.add(new Material("奇妙な心臓", 115, 135, 137,195));
        materials.add(new Material("奇妙な肉", 115, 192, 31,82));
        materials.add(new Material("吸血鬼の遺灰", 97, 31, 12,91));
        materials.add(new Material("巨人のつま先", 125, 13, 98,127));
        materials.add(new Material("巨大地衣類", 163, 114, 165,31));
        materials.add(new Material("虚無の塩", 163, 54, 115,33));
        materials.add(new Material("鶏の卵", 54, 137, 96,126));
        materials.add(new Material("光るキノコ", 53, 41, 84,13));
        materials.add(new Material("骨の粉", 125, 51, 45,124));
        materials.add(new Material("山の紫の花", 21, 82, 136,52));
        materials.add(new Material("山の青い花", 11, 45, 13,137));
        materials.add(new Material("山の赤い花", 31, 134, 33,115));
        materials.add(new Material("主根", 164, 43, 32,31));
        materials.add(new Material("出血の冠キノコ", 161, 76, 165,54));
        materials.add(new Material("小さな枝角", 165, 42, 126,115));
        materials.add(new Material("小麦", 11, 13, 127,136));
        materials.add(new Material("沼の群生キノコ", 53, 136, 192,11));
        materials.add(new Material("焼き焦げたスキーヴァーの皮", 21, 91, 55,11));
        materials.add(new Material("垂れ苔", 135, 13, 137,71));
        materials.add(new Material("青い蝶の羽", 125, 45, 137,85));
        materials.add(new Material("大きな枝角", 21, 23, 194,137));
        materials.add(new Material("鷹のくちばし", 21, 52, 98,53));
        materials.add(new Material("鷹の羽", 91, 74, 71,82));
        materials.add(new Material("蝶の羽", 11, 86, 126,135));
        materials.add(new Material("白かさキノコ", 162, 75, 31,134));
        materials.add(new Material("発光する塵", 135, 56, 41,53));
        materials.add(new Material("氷の塩鉱石", 161, 52, 31,45));
        materials.add(new Material("氷の生霊の歯", 162, 75, 97,161));
        materials.add(new Material("木椅子キノコ", 115, 116, 192,11));
    }

    /**
     * 空のポーションを生成し、それに素材に従って効果を追加していく.
     */
    public Potion compounding2(Material fir_mat, Material sec_mat) {
        Potion potion = new Potion(); //ポーション生成
        if(fir_mat.name.equals(sec_mat.name)) //塩 + 塩の組み合わせを消す
            return potion;
        for (int i=0; i <= 3; i++) { //2つの素材の効果8つを薬の潜在効果に追加する.
            potion.hidden_effects.add(fir_mat.effects.get(i));
            potion.hidden_effects.add(sec_mat.effects.get(i));
        }
        int more; //do-while文の仕様上,ここでmoreの宣言をする.
        do {
            more = 0; //moreのリセット.
            for (int i = 0; i < potion.hidden_effects.size(); i++) {
                for (int j = i + 1; j < potion.hidden_effects.size(); j++) {
                    if (potion.hidden_effects.get(i).equals(potion.hidden_effects.get(j))) { //hidden_effectsのi番目の効果とj番目の効果を比較している.
                        potion.effects.add(potion.hidden_effects.get(i)); //もし効果が一致した場合はその効果をpotion.effectsに追加する.
                        potion.hidden_effects.remove(i); //ポーションの潜在効果が発現したので,hidden_effectsからその効果を削除.
                        potion.hidden_effects.remove(j - 1); //i番目を削除したことにより要素の順番が変わったため,jではなくj-1.
                        more = 1; //要素の削除により,リストがグチャグチャになったのでリストの頭に戻る.
                        break;
                    }
                }
            }
        }while (more == 1);
        potion.putgoodness(); //ポーションの価値を設定.
        return potion;
    }

    /**
     * 空のポーションを生成し、それに素材に従って効果を追加していく.
     * 3種調合版
     */
    public Potion compounding3(Material fir_mat, Material sec_mat, Material thi_mat) {
        Potion potion = new Potion(); //ポーション生成
        if((fir_mat.name.equals(sec_mat.name)) || (fir_mat.name.equals(thi_mat.name)) || (sec_mat.name.equals(thi_mat.name))) //塩 + 塩 + 塩の組み合わせを消す
            return potion;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (fir_mat.effects.get(i).equals(sec_mat.effects.get(j))) { //1つ目の素材のi番目の効果と2つ目の素材のj番目の効果を比較している.
                    potion.effects.add(fir_mat.effects.get(i)); //もし効果が一致した場合はその数字をポーションの効果に追加する.
                }
            }
        }
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (fir_mat.effects.get(i).equals(thi_mat.effects.get(j))) { //1つ目の素材のi番目の効果と3つ目の素材のj番目の効果を比較している.
                    potion.effects.add(fir_mat.effects.get(i)); //もし効果が一致した場合はその数字をポーションの効果に追加する.
                }
            }
        }
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (sec_mat.effects.get(i).equals(thi_mat.effects.get(j))) { //2つ目の素材のi番目の効果と3つ目の素材のj番目の効果を比較している.
                    potion.effects.add(sec_mat.effects.get(i)); //もし効果が一致した場合はその数字をポーションの効果に追加する.
                }
            }
        }
        potion.effects = new ArrayList<>(new HashSet<>(potion.effects)); //重複した効果を消去
        potion.putgoodness(); //ポーションの価値を設定.
        return potion;
    }
}
