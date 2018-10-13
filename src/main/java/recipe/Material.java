package recipe;

import java.util.*;

/**
 * String name; //素材の名前
 * List<Integer> effects; //素材の効果.処理のし易さを考慮しint型で表している.表示の際には文に変換する.
 * List<Material> partner; //相性の良い素材.
 * 例:11>>体力治癒
 */
public class Material {
    public String name;
    public List<Integer> effects;
    public List<Material> partner;

    /**
     * コンストラクタ
     */
    public Material(String name, int first, int second, int third, int fourth) {
        this.name = name;
        effects = Arrays.asList(first,second,third,fourth);
        partner = new ArrayList<>();
    }
}
