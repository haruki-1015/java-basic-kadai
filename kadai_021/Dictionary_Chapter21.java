package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

    HashMap<String, String> wordMap = new HashMap<String, String>();

    public Dictionary_Chapter21() {

        wordMap.put("apple", "りんご");
        wordMap.put("peach", "桃");
        wordMap.put("banana", "バナナ");
        wordMap.put("lemon", "レモン");
        wordMap.put("pear", "梨");
        wordMap.put("kiwi", "キウィ");
        wordMap.put("strawberry", "いちご");
        wordMap.put("grape", "ぶどう");
        wordMap.put("muscat", "マスカット");
        wordMap.put("cherry", "さくらんぼ");
    }

    public void search(String[] words) {

        for (int i = 0; i < words.length; i++) {

            boolean found = false;

            for (String key : wordMap.keySet()) {

                if (key.equals(words[i])) {

                    System.out.println(words[i] + "の意味は"
                            + wordMap.get(words[i]));

                    found = true;
                }
            }

            if (found == false) {
                System.out.println(words[i] + "は辞書に存在しません");
            }
        }
    }
}