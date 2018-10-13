package recipe;

import java.util.*;

public class Paper {
    public List<String> effects;

    /**
     * コンストラクタ
     */
    public Paper() {
        effects = new ArrayList<>();
    }

    public void pri_mat_eff(Material material) { //素材の効果を出力するメソッド.
        for (int i=0; i<material.effects.size(); i++) {
            String effect = convert(material.effects.get(i));
            System.out.printf("     %s\n", effect);
        }
    }

    public void pri_pot_eff(Potion potion) { //ポーションの顕在効果を出力するメソッド.
        for (int i=0; i<potion.effects.size(); i++) {
            String effect = convert(potion.effects.get(i));
            if (potion.type.equals("薬")) {
                if (potion.effects.get(i) < 100) { //effectの数字が100未満だと有用な効果.
                    System.out.printf("     %s\n", effect);
                }else { //effectの数字が100以上だと有害な効果.
                    System.out.printf("     (%s)\n", effect);
                }
            }
            if (potion.type.equals("毒")) {
                if (potion.effects.get(i) < 100) { //effectの数字が100未満だと有用な効果.
                    System.out.printf("     (%s)\n", effect);
                }else { //effectの数字が100以上だと有害な効果.
                    System.out.printf("     %s\n", effect);
                }
            }
        }
    }

    public void pri_pot_hid_eff(Potion potion) { //ポーションの潜在効果を出力するメソッド.
        for (int i=0; i<potion.hidden_effects.size(); i++) {
            if (potion.type.equals("薬") && potion.hidden_effects.get(i) > 100)
                continue; //potion.typeが"薬"だった場合,毒の効果は出力しない.
            else if (potion.type.equals("毒") && potion.hidden_effects.get(i) < 100)
                continue; //potion.typeが"毒"だった場合,薬の効果は出力しない.
            else {
                String effect = convert(potion.hidden_effects.get(i));
                System.out.printf("     (%s)\n", effect);
            }
        }
    }

    /**
     * 数字で表された素材(ポーション)の効果を文に変換するメソッド.
     * @param converted //効果を表した数字.変形前.
     */
    public String convert(int converted) {
        String effect;
        switch (converted) {
            case 11:
                effect = "体力治癒";
                break;
            case 12:
                effect = "体力を治癒";
                break;
            case 13:
                effect = "体力上昇";
                break;
            case 114:
                effect = "体力破壊";
                break;
            case 115:
                effect = "体力減退";
                break;
            case 116:
                effect = "体力減退(残存)";
                break;
            case 21:
                effect = "スタミナ回復";
                break;
            case 22:
                effect = "スタミナを回復";
                break;
            case 23:
                effect = "スタミナ上昇";
                break;
            case 124:
                effect = "スタミナ破壊";
                break;
            case 125:
                effect = "スタミナ減退";
                break;
            case 126:
                effect = "スタミナ減退(残存)";
                break;
            case 127:
                effect = "スタミナ減退回復";
                break;
            case 31:
                effect = "マジカ回復";
                break;
            case 32:
                effect = "マジカを回復";
                break;
            case 33:
                effect = "マジカ上昇";
                break;
            case 134:
                effect = "マジカ破壊";
                break;
            case 135:
                effect = "マジカ減退";
                break;
            case 136:
                effect = "マジカ減退(残存)";
                break;
            case 137:
                effect = "マジカ減退回復";
                break;
            case 41:
                effect = "破壊上昇";
                break;
            case 42:
                effect = "回復上昇";
                break;
            case 43:
                effect = "幻惑上昇";
                break;
            case 44:
                effect = "変性上昇";
                break;
            case 45:
                effect = "召喚上昇";
                break;
            case 51:
                effect = "炎耐性";
                break;
            case 52:
                effect = "冷気耐性アップ";
                break;
            case 53:
                effect = "雷耐性";
                break;
            case 54:
                effect = "魔法耐性";
                break;
            case 55:
                effect = "毒耐性";
                break;
            case 161:
                effect = "炎耐性ダウン";
                break;
            case 162:
                effect = "冷気耐性ダウン";
                break;
            case 163:
                effect = "雷耐性ダウン";
                break;
            case 164:
                effect = "魔法耐性ダウン";
                break;
            case 165:
                effect = "毒耐性ダウン";
                break;
            case 71:
                effect = "片手武器上昇";
                break;
            case 72:
                effect = "両手武器上昇";
                break;
            case 73:
                effect = "弓術上昇";
                break;
            case 74:
                effect = "軽装上昇";
                break;
            case 75:
                effect = "重装上昇";
                break;
            case 76:
                effect = "防御上昇";
                break;
            case 81:
                effect = "スリ上昇";
                break;
            case 82:
                effect = "隠密上昇";
                break;
            case 83:
                effect = "開錠術上昇";
                break;
            case 84:
                effect = "鍛造上昇";
                break;
            case 85:
                effect = "付呪上昇";
                break;
            case 86:
                effect = "交渉上昇";
                break;
            case 91:
                effect = "疾病退散";
                break;
            case 192:
                effect = "麻痺";
                break;
            case 193:
                effect = "恐怖";
                break;
            case 194:
                effect = "減速";
                break;
            case 195:
                effect = "錯乱";
                break;
            case 96:
                effect = "水中呼吸";
                break;
            case 97:
                effect = "透明化";
                break;
            case 98:
                effect = "持運び重量上昇";
                break;
            default:
                effect = null;
        }
        return effect;
    }
}
