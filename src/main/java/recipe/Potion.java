package recipe;

import java.util.*;

/**
 * List<Integer> effects; //ポーションの効果.処理のし易さを考えてint型にし、表示の際に文章に変換する.
 * List<Integer> hidden_effects; //ポーションの潜在効果.
 * int goodness; //薬の性質がどのくらい強いのかを示す.
 * int budness; //毒の性質がどのくらい強いのかを示す.
 * int mix; //goodnessからbadnessを引いた数字.
 * String type; //薬なのか毒なのかを示す.
 */
public class Potion {
    public List<Integer> effects;
    public List<Integer> hidden_effects;
    public int goodness;
    public int badness;
    public int mix;
    public String type;

    /**
     * コンストラクタ
     */
    public Potion() {
        effects = new ArrayList<>();
        hidden_effects = new ArrayList<>();
        goodness = 0;
        badness = 0;
        mix = 0;
        type = "薬";
    }

    public void putgoodness() {
        for (int i=0; i<effects.size(); i++) {
            if (effects.get(i) < 100) { //effectの数字が100未満だと有用な効果.
                goodness++;
            }else { //effectの数字が100以上だと有害な効果.
                badness++;
            }
        }
        mix = goodness - badness;
        if (mix < 0) //goodnessがマイナスだと毒扱い.それ以外は薬扱い.
            type = "毒";
    }
}
