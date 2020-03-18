public class Text_Blocks {
    public static void main(String[] args) {
        String html2 = """
.................<html>
......................<body>
.........................<p>"Hello, world"</p>
......................</body>
.................</html>
                """;
        String sql = """
            Select `employee_name`,`salary`, from employee where employee order by employee_id;
        """;
        String win_path = """
        D:\\softwares\\jdk-13.0.1\\path
""";
        String a = """
        """;
        String b = """
""";
        //System.out.println(html2);
        String html = "<html>\n" +
                "       <body>\n" +
                "           <p>\"Hello, world\"</p>\n" +
                "       </body>\n" +
                "  </html>";
        String str2 = "Highlight \"ME\" ";
        String str3 = "chandra's tech blog..";
        String path = "D:\\softwares\\jdk-13.0.1\\bin";

        // Escape sequences..
        String html_seq = """
              <html>\n
                  <body>\n
                      <p>Hello, world</p>\n
                  </body>\n
              </html>\n
              """;
        System.out.println(html_seq);

        String outerblock =
                """
    String inner = \"""
        A text block inside a text block
    \""";
    """;
        //System.out.println(outerblock);
        String name = " user";
        String data = """
        Hello"""+ name+
                 """
 ! :)
""";
        System.out.println(data);
        System.out.println(outerblock);
        System.out.println(html_seq);
    }
}
