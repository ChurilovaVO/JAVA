package JAVA.HOMEWORK.HomeWork2;

public class Task2 {
    public static void main(String[] args) {
        String str = """
            Поздравляю с днем рождения! Желаю, чтобы мечты сбывались 
        каждый день, чтобы жизнь баловала и приносила сюрпризы. Пусть близкие и 
        любимые всегда будут рядом, любят и ценят. Деньги не обходят стороной,
        и здоровье прибавляется с каждым днем!""";
        System.out.println(str);
        System.out.println("\n");

        long begin = System.currentTimeMillis();
        System.out.println(str.replace("днем","ДЕНЕЧКОМ"));
        long end = System.currentTimeMillis();
        System.out.println(end - begin);

        StringBuilder str2 = new StringBuilder(str);
        String word="днем";
        long begin2 = System.currentTimeMillis();
        while (str2.indexOf(word)>0){
            str2.replace(str2.indexOf(word), str2.indexOf(word)+word.length(), "ДЕНЕЧКОМ");
        }
        System.out.println(str2);
        long end2 = System.currentTimeMillis();
        System.out.println(end2-begin2);
           
    }

}
