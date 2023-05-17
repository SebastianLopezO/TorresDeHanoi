public class Main {
    public static void main(String[] args) {
        Html File = new Html();
        File.AddBody("<div class=\"hanoi\">\n" +
                "    <div class=\"title\">Torres de Hanoi A</div>\n" +
                "    <div class=\"tower\">\n" +
                "        <div class=\"rod\">A</div>\n" +
                "        <div class=\"discs\">\n" +
                "            <div class=\"disc one\">1</div>\n" +
                "            <div class=\"disc two\">2</div>\n" +
                "            <div class=\"disc three\">3</div>\n" +
                "            <div class=\"disc four\">4</div>\n" +
                "            <div class=\"disc five\">5</div>\n" +
                "            <div class=\"disc six\">6</div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    <div class=\"tower\">\n" +
                "        <div class=\"rod\">B</div>\n" +
                "        <div class=\"discs\">\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    <div class=\"tower\">\n" +
                "        <div class=\"rod\">C</div>\n" +
                "        <div class=\"discs\">\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    <div class=\"base\"></div>\n" +
                "</div>");
        File.Export("Testeo");
        System.out.println("Hello world!");
    }
}