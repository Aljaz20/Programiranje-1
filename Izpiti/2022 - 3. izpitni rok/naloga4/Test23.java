
import java.util.*;

public class Test23 {

    public static void main(String[] args) {
        String zacetno = "q9";

        Set<String> sprejemna = new HashSet<>();
        sprejemna.add("q8");

        Map<String, Map<Character, String>> prehodi = new HashMap<>();
        prehodi.put("q0", new HashMap<>());
        prehodi.put("q1", new HashMap<>());
        prehodi.put("q2", new HashMap<>());
        prehodi.put("q3", new HashMap<>());
        prehodi.put("q4", new HashMap<>());
        prehodi.put("q5", new HashMap<>());
        prehodi.put("q6", new HashMap<>());
        prehodi.put("q7", new HashMap<>());
        prehodi.put("q8", new HashMap<>());
        prehodi.put("q9", new HashMap<>());
        prehodi.put("q10", new HashMap<>());
        prehodi.put("q11", new HashMap<>());
        prehodi.put("q12", new HashMap<>());
        prehodi.put("q13", new HashMap<>());
        prehodi.put("q14", new HashMap<>());
        prehodi.put("q15", new HashMap<>());
        prehodi.put("q16", new HashMap<>());
        prehodi.put("q17", new HashMap<>());
        prehodi.put("q18", new HashMap<>());
        prehodi.put("q19", new HashMap<>());
        prehodi.get("q0").put('a', "q4");
        prehodi.get("q0").put('b', "q1");
        prehodi.get("q0").put('c', "q12");
        prehodi.get("q0").put('d', "q3");
        prehodi.get("q1").put('a', "q1");
        prehodi.get("q1").put('b', "q6");
        prehodi.get("q1").put('c', "q14");
        prehodi.get("q1").put('d', "q12");
        prehodi.get("q2").put('a', "q11");
        prehodi.get("q2").put('b', "q4");
        prehodi.get("q2").put('c', "q0");
        prehodi.get("q2").put('d', "q9");
        prehodi.get("q3").put('a', "q7");
        prehodi.get("q3").put('b', "q16");
        prehodi.get("q3").put('c', "q11");
        prehodi.get("q3").put('d', "q4");
        prehodi.get("q4").put('a', "q7");
        prehodi.get("q4").put('b', "q14");
        prehodi.get("q4").put('c', "q16");
        prehodi.get("q4").put('d', "q19");
        prehodi.get("q5").put('a', "q6");
        prehodi.get("q5").put('b', "q11");
        prehodi.get("q5").put('c', "q13");
        prehodi.get("q5").put('d', "q0");
        prehodi.get("q6").put('a', "q0");
        prehodi.get("q6").put('b', "q6");
        prehodi.get("q6").put('c', "q4");
        prehodi.get("q6").put('d', "q1");
        prehodi.get("q7").put('a', "q15");
        prehodi.get("q7").put('b', "q8");
        prehodi.get("q7").put('c', "q4");
        prehodi.get("q7").put('d', "q6");
        prehodi.get("q8").put('a', "q17");
        prehodi.get("q8").put('b', "q16");
        prehodi.get("q8").put('c', "q7");
        prehodi.get("q8").put('d', "q5");
        prehodi.get("q9").put('a', "q0");
        prehodi.get("q9").put('b', "q5");
        prehodi.get("q9").put('c', "q7");
        prehodi.get("q9").put('d', "q1");
        prehodi.get("q10").put('a', "q4");
        prehodi.get("q10").put('b', "q13");
        prehodi.get("q10").put('c', "q3");
        prehodi.get("q10").put('d', "q6");
        prehodi.get("q11").put('a', "q19");
        prehodi.get("q11").put('b', "q3");
        prehodi.get("q11").put('c', "q10");
        prehodi.get("q11").put('d', "q12");
        prehodi.get("q12").put('a', "q7");
        prehodi.get("q12").put('b', "q2");
        prehodi.get("q12").put('c', "q11");
        prehodi.get("q12").put('d', "q14");
        prehodi.get("q13").put('a', "q4");
        prehodi.get("q13").put('b', "q11");
        prehodi.get("q13").put('c', "q9");
        prehodi.get("q13").put('d', "q18");
        prehodi.get("q14").put('a', "q6");
        prehodi.get("q14").put('b', "q14");
        prehodi.get("q14").put('c', "q11");
        prehodi.get("q14").put('d', "q0");
        prehodi.get("q15").put('a', "q17");
        prehodi.get("q15").put('b', "q10");
        prehodi.get("q15").put('c', "q12");
        prehodi.get("q15").put('d', "q1");
        prehodi.get("q16").put('a', "q16");
        prehodi.get("q16").put('b', "q0");
        prehodi.get("q16").put('c', "q4");
        prehodi.get("q16").put('d', "q2");
        prehodi.get("q17").put('a', "q2");
        prehodi.get("q17").put('b', "q11");
        prehodi.get("q17").put('c', "q0");
        prehodi.get("q17").put('d', "q7");
        prehodi.get("q18").put('a', "q6");
        prehodi.get("q18").put('b', "q15");
        prehodi.get("q18").put('c', "q11");
        prehodi.get("q18").put('d', "q4");
        prehodi.get("q19").put('a', "q16");
        prehodi.get("q19").put('b', "q3");
        prehodi.get("q19").put('c', "q17");
        prehodi.get("q19").put('d', "q7");

        Cetrta.Avtomat avtomat = new Cetrta.Avtomat(zacetno, sprejemna, prehodi);

        System.out.println(avtomat.kam("bcdd"));
        System.out.println(avtomat.kam("bdddbd"));
        System.out.println(avtomat.kam("bcada"));
        System.out.println(avtomat.kam("ddbcac"));
        System.out.println(avtomat.kam("bcdcdb"));
        System.out.println(avtomat.kam("dbdbcb"));
        System.out.println(avtomat.kam("ddbcbd"));
        System.out.println(avtomat.kam("bcdbad"));
        System.out.println(avtomat.kam("bbccdc"));
        System.out.println(avtomat.kam("bdab"));
        System.out.println(avtomat.kam("dccdda"));
        System.out.println(avtomat.kam("dbbaa"));
        System.out.println(avtomat.kam("daddbb"));
    }
}
