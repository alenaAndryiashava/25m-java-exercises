package transformers;

public class Transformer {
    public static void main(String[] args) {
        System.out.println("With stringBuilder");
        //transform1("aaa BBBB dEF", new WordsTransformerLowerCase());
        //transform1("aaa BBBB dEF",new WordsTransformerUpperCase());
        //transform1("aaa BBBB dEFrt", new WordsTransformerStar());

        System.out.println("With join");
        //System.out.println(transform("aaa BBBB dEF", new WordsTransformerLowerCase()));
        //System.out.println(transform("aaa BBBB dEF",new WordsTransformerUpperCase()));
        //System.out.println(transform("aaa BBBB dEFrt", new WordsTransformerStar()));

    }

    public void transform1(String string, WordsTransformer transformer){
        String[] words = string.split("\\s");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (transformer.check(words[i])) {
                words[i] = transformer.transform(words[i]);
            }
            stringBuilder.append(words[i]);
            if (i < words.length-1) {
                stringBuilder.append(" ");
            }
        }
        System.out.println(string + "->" + stringBuilder);
    }

    public String transform(String string, WordsTransformer transformer){
        String[] words = string.split(" ");
        for (int i = 0; i < words.length ; i++) {
            if (transformer.check(words[i])) {
                words[i] = transformer.transform(words[i]);
            }
        }
            return String.join(" ",words);
    }
}
