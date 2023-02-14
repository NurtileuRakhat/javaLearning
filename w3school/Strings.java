public class Strings{
    public static void main(String[] args){
        String s = "Hello World";
        System.out.println("Strign size: " + s.length());// Длина
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.indexOf("World"));//возвращает индекс (позицию) первого появления указанного текста в строке (включая пробелы):indexOf()
        String firstName = "Nutrileu ";
        String lastName = "Rakhat";
        // ОБЪЕДЕНИТЬ ДВЕ СТРОКИ
        System.out.println(firstName + lastName);
        // or
        System.out.println(firstName.concat(lastName));
        // Strings - Special Characters
        System.out.println("It\'s \n\"print\" , \\JAVA\\");
        // \r - Carriage Return
        System.out.println("Hello\rWorld");// Delete "Hello"
        // \t - tab
        System.out.println("Hello\tWorld");
        // \b - backspace
        System.out.println("Hellox\bWorld");// Delete 'x'
        // \f -Form Feed
        System.out.printf("Hello\fWorld");
    }
}