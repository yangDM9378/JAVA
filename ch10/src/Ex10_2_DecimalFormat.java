import java.text.DecimalFormat;

public class Ex10_2_DecimalFormat {
    public static void main(String[] args) {
        double number = 1234567.89;
        String[] pattern ={
                "0",
                "#",
                "0.0",
                "#.#",
                "0000000000.0000",
                "#.#-",
                "-#.#",
                "#,###.##",
                "#,####.##",
                "#E0",
                "0E0",
                "##E0",
                "00E0",
                "####E0",
                "0000E0",
                "#.#E0",
                "0.0E0",
                "0.00000E0",
                "00.0000E0",
                "000.0000E0",
                "#.####E0",
                "##.####E0",
                "###.####E0",
                "#,###.##+;#,###.##-",
                "#.#%",
                "'#'#,###",
                "'#'#,###",
                "''#,###"
        };
        for(int i=0; i<pattern.length; i++) {
            DecimalFormat df = new DecimalFormat(pattern[i]);
            String result = df.format(number);
            System.out.println(pattern[i]+" : "+result);
        }
    }
}
