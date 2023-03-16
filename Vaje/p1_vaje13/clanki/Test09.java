
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        Avtor[] avtorji = {
            new Avtor("Jana", "Ermenc"),
            new Avtor("Mateja", "Bevc"),
            new Avtor("Hinko", "Veble"),
            new Avtor("Olga", "Savc"),
            new Avtor("Tone", "Bevc"),
            new Avtor("Cvetko", "Novak"),
            new Avtor("Cvetko", "Rant"),
            new Avtor("Hinko", "Kotnik"),
            new Avtor("Bojan", "Cotman"),
            new Avtor("Urban", "Jelen"),
            new Avtor("Hinko", "Antlej"),
            new Avtor("Lojze", "Jelen"),
            new Avtor("Draga", "Urh"),
            new Avtor("Iva", "Jelen"),
            new Avtor("Cvetko", "Tratnik"),
            new Avtor("Bojan", "Leban"),
            new Avtor("Draga", "Mastnak"),
            new Avtor("Zoran", "Veble"),
            new Avtor("Mateja", "Tratnik"),
            new Avtor("Gorazd", "Kotnik"),
            new Avtor("Karel", "Golob"),
            new Avtor("Lojze", "Ermenc"),
            new Avtor("Urban", "Ilih"),
            new Avtor("Peter", "Veble"),
            new Avtor("Ana", "Golob"),
            new Avtor("Veronika", "Kotnik"),
            new Avtor("Mateja", "Hojnik"),
            new Avtor("Peter", "Hojnik"),
            new Avtor("Franci", "Hojnik"),
            new Avtor("Jana", "Oblak"),
            new Avtor("Peter", "Veble"),
            new Avtor("Zoran", "Antlej"),
            new Avtor("Sonja", "Urh"),
            new Avtor("Zoran", "Debeljak"),
            new Avtor("Tone", "Fajdiga"),
            new Avtor("Bojan", "Oblak"),
            new Avtor("Zoran", "Kotnik"),
            new Avtor("Cvetko", "Zorc"),
            new Avtor("Zoran", "Urh"),
            new Avtor("Franci", "Cotman"),
            new Avtor("Eva", "Cotman"),
            new Avtor("Karel", "Savc"),
            new Avtor("Gorazd", "Savc"),
            new Avtor("Mateja", "Rant"),
            new Avtor("Tone", "Urh"),
            new Avtor("Tone", "Tratnik"),
            new Avtor("Peter", "Antlej"),
            new Avtor("Peter", "Mastnak"),
            new Avtor("Jana", "Zorc"),
            new Avtor("Roman", "Oblak"),
            new Avtor("Gorazd", "Hojnik"),
            new Avtor("Urban", "Leban"),
            new Avtor("Sonja", "Leban"),
            new Avtor("Gorazd", "Fajdiga"),
            new Avtor("Tone", "Podobnik"),
            new Avtor("Sonja", "Veble"),
            new Avtor("Bojan", "Jelen"),
            new Avtor("Lojze", "Zorc"),
            new Avtor("Bojan", "Savc"),
            new Avtor("Bojan", "Ilih"),
            new Avtor("Olga", "Novak"),
            new Avtor("Gorazd", "Veble"),
            new Avtor("Lojze", "Kotnik"),
            new Avtor("Urban", "Oblak"),
            new Avtor("Karel", "Golob"),
            new Avtor("Nina", "Hojnik"),
            new Avtor("Hinko", "Veble"),
            new Avtor("Bojan", "Mastnak"),
            new Avtor("Hinko", "Veble"),
            new Avtor("Ana", "Cotman"),
            new Avtor("Roman", "Ilih"),
            new Avtor("Olga", "Antlej"),
            new Avtor("Draga", "Kotnik"),
            new Avtor("Eva", "Fajdiga"),
            new Avtor("Draga", "Leban"),
            new Avtor("Roman", "Hojnik"),
            new Avtor("Mateja", "Mastnak"),
            new Avtor("Tone", "Veble"),
            new Avtor("Nina", "Bevc"),
            new Avtor("Iva", "Podobnik"),
            new Avtor("Lojze", "Antlej"),
            new Avtor("Olga", "Oblak"),
            new Avtor("Bojan", "Leban"),
            new Avtor("Nina", "Tratnik"),
            new Avtor("Mateja", "Savc"),
            new Avtor("Peter", "Veble"),
            new Avtor("Tone", "Antlej"),
            new Avtor("Tone", "Jelen"),
            new Avtor("Karel", "Novak"),
            new Avtor("Sonja", "Mastnak"),
            new Avtor("Sonja", "Podobnik"),
            new Avtor("Gorazd", "Bevc"),
            new Avtor("Lojze", "Bevc"),
            new Avtor("Eva", "Cotman"),
            new Avtor("Mateja", "Antlej"),
            new Avtor("Karel", "Leban"),
            new Avtor("Peter", "Leban"),
            new Avtor("Eva", "Rant"),
            new Avtor("Franci", "Fajdiga"),
            new Avtor("Gorazd", "Debeljak"),
            new Avtor("Gorazd", "Zorc"),
            new Avtor("Mateja", "Oblak"),
            new Avtor("Olga", "Fajdiga"),
            new Avtor("Iva", "Jelen"),
            new Avtor("Jana", "Debeljak"),
            new Avtor("Mateja", "Ilih"),
            new Avtor("Bojan", "Debeljak"),
            new Avtor("Franci", "Leban"),
            new Avtor("Karel", "Debeljak"),
            new Avtor("Karel", "Leban"),
            new Avtor("Tone", "Savc"),
            new Avtor("Olga", "Veble"),
            new Avtor("Nina", "Ilih"),
            new Avtor("Veronika", "Zorc"),
            new Avtor("Veronika", "Rant"),
            new Avtor("Peter", "Leban"),
            new Avtor("Franci", "Debeljak"),
            new Avtor("Gorazd", "Tratnik"),
            new Avtor("Iva", "Tratnik"),
            new Avtor("Hinko", "Leban"),
            new Avtor("Olga", "Jelen"),
            new Avtor("Zoran", "Fajdiga"),
            new Avtor("Iva", "Mastnak"),
            new Avtor("Lojze", "Zorc"),
            new Avtor("Sonja", "Rant"),
            new Avtor("Karel", "Oblak"),
            new Avtor("Veronika", "Tratnik"),
            new Avtor("Urban", "Hojnik"),
            new Avtor("Tone", "Mastnak"),
            new Avtor("Cvetko", "Kotnik"),
            new Avtor("Urban", "Bevc"),
            new Avtor("Gorazd", "Savc"),
            new Avtor("Sonja", "Bevc"),
            new Avtor("Gorazd", "Oblak"),
            new Avtor("Gorazd", "Bevc"),
            new Avtor("Peter", "Savc"),
            new Avtor("Bojan", "Ilih"),
            new Avtor("Veronika", "Podobnik"),
            new Avtor("Jana", "Zorc"),
            new Avtor("Peter", "Leban"),
            new Avtor("Cvetko", "Novak"),
            new Avtor("Peter", "Bevc"),
            new Avtor("Franci", "Urh"),
            new Avtor("Jana", "Rant"),
            new Avtor("Mateja", "Hojnik"),
            new Avtor("Cvetko", "Leban"),
            new Avtor("Karel", "Hojnik"),
            new Avtor("Ana", "Novak"),
            new Avtor("Roman", "Urh"),
            new Avtor("Nina", "Podobnik"),
            new Avtor("Zoran", "Leban"),
            new Avtor("Franci", "Tratnik"),
            new Avtor("Peter", "Kotnik"),
            new Avtor("Gorazd", "Fajdiga"),
            new Avtor("Cvetko", "Novak"),
            new Avtor("Peter", "Veble"),
            new Avtor("Ana", "Fajdiga"),
            new Avtor("Bojan", "Veble"),
            new Avtor("Hinko", "Zorc"),
            new Avtor("Zoran", "Oblak"),
            new Avtor("Roman", "Leban"),
            new Avtor("Gorazd", "Antlej"),
            new Avtor("Nina", "Cotman"),
            new Avtor("Veronika", "Novak"),
            new Avtor("Veronika", "Bevc"),
            new Avtor("Cvetko", "Leban"),
            new Avtor("Cvetko", "Golob"),
            new Avtor("Peter", "Zorc"),
            new Avtor("Franci", "Zorc"),
            new Avtor("Jana", "Golob"),
            new Avtor("Sonja", "Hojnik"),
            new Avtor("Karel", "Fajdiga"),
            new Avtor("Mateja", "Podobnik"),
            new Avtor("Draga", "Savc"),
            new Avtor("Cvetko", "Rant"),
            new Avtor("Lojze", "Ermenc"),
            new Avtor("Veronika", "Kotnik"),
            new Avtor("Peter", "Debeljak"),
            new Avtor("Zoran", "Golob"),
            new Avtor("Bojan", "Podobnik"),
            new Avtor("Iva", "Savc"),
            new Avtor("Roman", "Kotnik"),
            new Avtor("Cvetko", "Mastnak"),
            new Avtor("Zoran", "Tratnik"),
            new Avtor("Cvetko", "Ermenc"),
            new Avtor("Franci", "Tratnik"),
            new Avtor("Olga", "Zorc"),
            new Avtor("Nina", "Hojnik"),
            new Avtor("Karel", "Savc"),
            new Avtor("Zoran", "Rant"),
            new Avtor("Mateja", "Bevc"),
            new Avtor("Hinko", "Kotnik"),
            new Avtor("Olga", "Zorc"),
            new Avtor("Jana", "Urh"),
            new Avtor("Gorazd", "Hojnik"),
            new Avtor("Tone", "Rant"),
            new Avtor("Mateja", "Bevc"),
            new Avtor("Ana", "Golob"),
            new Avtor("Karel", "Tratnik"),
            new Avtor("Sonja", "Fajdiga"),
            new Avtor("Urban", "Antlej"),
            new Avtor("Nina", "Debeljak"),
            new Avtor("Iva", "Veble"),
            new Avtor("Bojan", "Urh"),
            new Avtor("Jana", "Rant"),
            new Avtor("Urban", "Golob"),
            new Avtor("Draga", "Tratnik"),
            new Avtor("Urban", "Rant"),
            new Avtor("Eva", "Cotman"),
            new Avtor("Tone", "Urh"),
            new Avtor("Eva", "Ilih"),
            new Avtor("Ana", "Tratnik"),
            new Avtor("Lojze", "Mastnak"),
            new Avtor("Iva", "Bevc"),
            new Avtor("Bojan", "Novak"),
            new Avtor("Tone", "Veble"),
            new Avtor("Franci", "Bevc"),
            new Avtor("Ana", "Ermenc"),
            new Avtor("Lojze", "Leban"),
            new Avtor("Sonja", "Debeljak"),
            new Avtor("Eva", "Fajdiga"),
            new Avtor("Tone", "Mastnak"),
            new Avtor("Olga", "Leban"),
            new Avtor("Franci", "Oblak"),
            new Avtor("Peter", "Leban"),
            new Avtor("Iva", "Oblak"),
            new Avtor("Sonja", "Podobnik"),
            new Avtor("Roman", "Ermenc"),
            new Avtor("Tone", "Novak"),
            new Avtor("Sonja", "Ermenc"),
            new Avtor("Urban", "Zorc"),
            new Avtor("Eva", "Zorc"),
            new Avtor("Urban", "Veble"),
            new Avtor("Olga", "Ilih"),
            new Avtor("Olga", "Ilih"),
            new Avtor("Karel", "Hojnik"),
            new Avtor("Veronika", "Novak"),
            new Avtor("Gorazd", "Antlej"),
            new Avtor("Tone", "Urh"),
            new Avtor("Franci", "Hojnik"),
            new Avtor("Bojan", "Oblak"),
            new Avtor("Veronika", "Zorc"),
            new Avtor("Peter", "Debeljak"),
            new Avtor("Draga", "Zorc"),
            new Avtor("Draga", "Fajdiga"),
            new Avtor("Cvetko", "Ermenc"),
            new Avtor("Gorazd", "Ermenc"),
            new Avtor("Cvetko", "Veble"),
            new Avtor("Zoran", "Fajdiga"),
            new Avtor("Ana", "Leban"),
            new Avtor("Jana", "Hojnik"),
            new Avtor("Urban", "Veble"),
            new Avtor("Eva", "Bevc"),
            new Avtor("Roman", "Jelen"),
            new Avtor("Franci", "Golob"),
            new Avtor("Peter", "Zorc"),
            new Avtor("Jana", "Veble"),
            new Avtor("Peter", "Novak"),
            new Avtor("Ana", "Savc"),
            new Avtor("Jana", "Hojnik"),
            new Avtor("Tone", "Savc"),
            new Avtor("Zoran", "Golob"),
            new Avtor("Draga", "Golob"),
            new Avtor("Cvetko", "Rant"),
            new Avtor("Nina", "Debeljak"),
            new Avtor("Gorazd", "Novak"),
            new Avtor("Franci", "Ermenc"),
            new Avtor("Eva", "Leban"),
            new Avtor("Olga", "Urh"),
            new Avtor("Karel", "Rant"),
            new Avtor("Tone", "Zorc"),
            new Avtor("Zoran", "Bevc"),
            new Avtor("Peter", "Savc"),
            new Avtor("Ana", "Oblak"),
            new Avtor("Nina", "Tratnik"),
            new Avtor("Karel", "Tratnik"),
            new Avtor("Jana", "Ilih"),
            new Avtor("Eva", "Mastnak"),
            new Avtor("Eva", "Golob"),
            new Avtor("Franci", "Bevc"),
            new Avtor("Veronika", "Fajdiga"),
            new Avtor("Sonja", "Ermenc"),
            new Avtor("Cvetko", "Savc"),
            new Avtor("Tone", "Mastnak"),
            new Avtor("Eva", "Podobnik"),
            new Avtor("Cvetko", "Oblak"),
            new Avtor("Roman", "Bevc"),
            new Avtor("Veronika", "Mastnak"),
            new Avtor("Lojze", "Antlej"),
            new Avtor("Lojze", "Antlej"),
            new Avtor("Roman", "Golob"),
            new Avtor("Draga", "Ermenc"),
            new Avtor("Eva", "Kotnik"),
            new Avtor("Lojze", "Hojnik"),
            new Avtor("Urban", "Cotman"),
            new Avtor("Karel", "Ermenc"),
            new Avtor("Peter", "Jelen"),
            new Avtor("Iva", "Ilih"),
            new Avtor("Zoran", "Ilih"),
            new Avtor("Roman", "Savc"),
            new Avtor("Zoran", "Kotnik"),
            new Avtor("Peter", "Hojnik"),
            new Avtor("Tone", "Ilih"),
            new Avtor("Mateja", "Ilih"),
            new Avtor("Urban", "Debeljak"),
            new Avtor("Gorazd", "Novak"),
            new Avtor("Nina", "Tratnik"),
            new Avtor("Draga", "Tratnik"),
            new Avtor("Roman", "Mastnak"),
            new Avtor("Eva", "Bevc"),
            new Avtor("Iva", "Bevc"),
            new Avtor("Bojan", "Veble"),
            new Avtor("Hinko", "Jelen"),
            new Avtor("Eva", "Golob"),
            new Avtor("Urban", "Golob"),
            new Avtor("Karel", "Ermenc"),
            new Avtor("Zoran", "Novak"),
            new Avtor("Zoran", "Mastnak"),
            new Avtor("Ana", "Ermenc"),
            new Avtor("Peter", "Ermenc"),
            new Avtor("Roman", "Urh"),
            new Avtor("Iva", "Jelen"),
            new Avtor("Ana", "Veble"),
            new Avtor("Zoran", "Novak"),
            new Avtor("Gorazd", "Tratnik"),
            new Avtor("Peter", "Leban"),
            new Avtor("Hinko", "Golob"),
            new Avtor("Gorazd", "Tratnik"),
            new Avtor("Olga", "Veble"),
            new Avtor("Bojan", "Tratnik"),
            new Avtor("Zoran", "Novak"),
            new Avtor("Zoran", "Savc"),
            new Avtor("Eva", "Oblak"),
            new Avtor("Ana", "Cotman"),
            new Avtor("Nina", "Savc"),
            new Avtor("Eva", "Golob"),
            new Avtor("Draga", "Oblak"),
            new Avtor("Franci", "Debeljak"),
            new Avtor("Franci", "Zorc"),
            new Avtor("Veronika", "Veble"),
            new Avtor("Hinko", "Savc"),
            new Avtor("Lojze", "Zorc"),
            new Avtor("Eva", "Novak"),
            new Avtor("Sonja", "Hojnik"),
            new Avtor("Hinko", "Zorc"),
            new Avtor("Sonja", "Mastnak"),
            new Avtor("Hinko", "Kotnik"),
            new Avtor("Eva", "Debeljak"),
            new Avtor("Jana", "Mastnak"),
            new Avtor("Gorazd", "Oblak"),
            new Avtor("Lojze", "Novak"),
            new Avtor("Ana", "Hojnik"),
            new Avtor("Bojan", "Podobnik"),
            new Avtor("Tone", "Hojnik"),
            new Avtor("Tone", "Tratnik"),
            new Avtor("Lojze", "Urh"),
            new Avtor("Eva", "Novak"),
            new Avtor("Hinko", "Golob"),
            new Avtor("Urban", "Cotman"),
            new Avtor("Mateja", "Jelen"),
            new Avtor("Tone", "Savc"),
            new Avtor("Ana", "Jelen"),
            new Avtor("Gorazd", "Golob"),
            new Avtor("Jana", "Leban"),
            new Avtor("Franci", "Golob"),
            new Avtor("Sonja", "Jelen"),
            new Avtor("Veronika", "Debeljak"),
            new Avtor("Gorazd", "Hojnik"),
            new Avtor("Karel", "Debeljak"),
            new Avtor("Cvetko", "Kotnik"),
            new Avtor("Iva", "Rant"),
            new Avtor("Hinko", "Oblak"),
            new Avtor("Nina", "Leban"),
            new Avtor("Gorazd", "Podobnik"),
            new Avtor("Nina", "Ilih"),
            new Avtor("Peter", "Podobnik"),
            new Avtor("Lojze", "Ilih"),
            new Avtor("Gorazd", "Mastnak"),
            new Avtor("Jana", "Antlej"),
            new Avtor("Cvetko", "Rant"),
            new Avtor("Bojan", "Novak"),
            new Avtor("Franci", "Tratnik"),
            new Avtor("Nina", "Veble"),
            new Avtor("Veronika", "Fajdiga"),
            new Avtor("Roman", "Kotnik"),
            new Avtor("Ana", "Oblak"),
            new Avtor("Mateja", "Golob"),
            new Avtor("Hinko", "Rant"),
            new Avtor("Franci", "Bevc"),
            new Avtor("Ana", "Zorc"),
            new Avtor("Veronika", "Novak"),
            new Avtor("Olga", "Podobnik"),
            new Avtor("Gorazd", "Zorc"),
            new Avtor("Lojze", "Rant"),
            new Avtor("Olga", "Fajdiga"),
            new Avtor("Sonja", "Antlej"),
            new Avtor("Peter", "Cotman"),
            new Avtor("Peter", "Novak"),
            new Avtor("Karel", "Leban"),
            new Avtor("Peter", "Golob"),
            new Avtor("Franci", "Jelen"),
            new Avtor("Olga", "Hojnik"),
            new Avtor("Gorazd", "Kotnik"),
            new Avtor("Hinko", "Rant"),
            new Avtor("Karel", "Cotman"),
            new Avtor("Veronika", "Urh"),
            new Avtor("Mateja", "Debeljak"),
            new Avtor("Mateja", "Leban"),
            new Avtor("Draga", "Golob"),
            new Avtor("Roman", "Cotman"),
            new Avtor("Cvetko", "Mastnak"),
            new Avtor("Eva", "Urh"),
            new Avtor("Draga", "Veble"),
            new Avtor("Iva", "Zorc"),
            new Avtor("Roman", "Leban"),
            new Avtor("Peter", "Rant"),
            new Avtor("Franci", "Oblak"),
            new Avtor("Karel", "Zorc"),
            new Avtor("Karel", "Debeljak"),
            new Avtor("Hinko", "Debeljak"),
            new Avtor("Eva", "Veble"),
            new Avtor("Veronika", "Jelen"),
            new Avtor("Bojan", "Kotnik"),
            new Avtor("Cvetko", "Rant"),
            new Avtor("Ana", "Veble"),
            new Avtor("Peter", "Tratnik"),
            new Avtor("Veronika", "Zorc"),
            new Avtor("Franci", "Rant"),
            new Avtor("Veronika", "Tratnik"),
            new Avtor("Karel", "Kotnik"),
            new Avtor("Nina", "Zorc"),
            new Avtor("Eva", "Podobnik"),
            new Avtor("Cvetko", "Debeljak"),
            new Avtor("Nina", "Savc"),
            new Avtor("Sonja", "Golob"),
            new Avtor("Tone", "Oblak"),
            new Avtor("Sonja", "Bevc"),
            new Avtor("Franci", "Ermenc"),
            new Avtor("Ana", "Ilih"),
            new Avtor("Lojze", "Zorc"),
            new Avtor("Draga", "Fajdiga"),
            new Avtor("Cvetko", "Novak"),
            new Avtor("Peter", "Jelen"),
            new Avtor("Nina", "Ermenc"),
            new Avtor("Lojze", "Rant"),
            new Avtor("Bojan", "Urh"),
            new Avtor("Bojan", "Mastnak"),
            new Avtor("Karel", "Kotnik"),
            new Avtor("Eva", "Ilih"),
            new Avtor("Gorazd", "Ermenc"),
            new Avtor("Iva", "Hojnik"),
            new Avtor("Draga", "Bevc"),
            new Avtor("Mateja", "Cotman"),
            new Avtor("Tone", "Jelen"),
            new Avtor("Gorazd", "Urh"),
            new Avtor("Veronika", "Jelen"),
            new Avtor("Cvetko", "Debeljak"),
            new Avtor("Veronika", "Fajdiga"),
            new Avtor("Zoran", "Novak"),
            new Avtor("Veronika", "Podobnik"),
            new Avtor("Sonja", "Bevc"),
            new Avtor("Urban", "Leban"),
            new Avtor("Roman", "Cotman"),
            new Avtor("Olga", "Ilih"),
            new Avtor("Olga", "Antlej"),
            new Avtor("Urban", "Savc"),
            new Avtor("Eva", "Veble"),
            new Avtor("Draga", "Antlej"),
            new Avtor("Gorazd", "Podobnik"),
            new Avtor("Sonja", "Jelen"),
            new Avtor("Eva", "Jelen"),
            new Avtor("Jana", "Antlej"),
            new Avtor("Sonja", "Bevc"),
            new Avtor("Olga", "Leban"),
            new Avtor("Iva", "Tratnik"),
            new Avtor("Gorazd", "Podobnik"),
            new Avtor("Cvetko", "Antlej"),
            new Avtor("Nina", "Novak"),
            new Avtor("Zoran", "Debeljak"),
            new Avtor("Jana", "Ilih"),
            new Avtor("Franci", "Ermenc"),
            new Avtor("Veronika", "Hojnik"),
            new Avtor("Bojan", "Zorc"),
            new Avtor("Iva", "Mastnak"),
            new Avtor("Eva", "Antlej"),
            new Avtor("Sonja", "Zorc"),
            new Avtor("Sonja", "Leban"),
            new Avtor("Olga", "Golob"),
            new Avtor("Zoran", "Leban"),
            new Avtor("Lojze", "Savc"),
            new Avtor("Urban", "Podobnik"),
            new Avtor("Olga", "Ilih"),
            new Avtor("Veronika", "Ilih"),
            new Avtor("Nina", "Ermenc"),
            new Avtor("Draga", "Podobnik"),
            new Avtor("Cvetko", "Tratnik"),
            new Avtor("Sonja", "Savc"),
            new Avtor("Veronika", "Novak"),
            new Avtor("Cvetko", "Kotnik"),
            new Avtor("Peter", "Cotman")
        };

        List<Clanek> clanki = List.of(
            new Clanek(List.of(avtorji[190], avtorji[14], avtorji[121]), "babaa", 2012),
            new Clanek(List.of(avtorji[7], avtorji[119], avtorji[121]), "baabb", 2010),
            new Clanek(List.of(avtorji[26], avtorji[21]), "bbbba", 2013),
            new Clanek(List.of(avtorji[135], avtorji[62]), "ababa", 2009),
            new Clanek(List.of(avtorji[234], avtorji[491], avtorji[486]), "abaaa", 2001),
            new Clanek(List.of(avtorji[98], avtorji[494], avtorji[352]), "bbbbb", 2000),
            new Clanek(List.of(avtorji[243]), "abbbb", 2010),
            new Clanek(List.of(avtorji[18]), "abbaa", 2007),
            new Clanek(List.of(avtorji[439], avtorji[367], avtorji[5]), "abaaa", 2005),
            new Clanek(List.of(avtorji[291]), "bbaab", 2010),
            new Clanek(List.of(avtorji[484], avtorji[2]), "aabab", 2001),
            new Clanek(List.of(avtorji[163], avtorji[128], avtorji[216]), "abaaa", 2005),
            new Clanek(List.of(avtorji[115], avtorji[6]), "babba", 2000),
            new Clanek(List.of(avtorji[294], avtorji[434], avtorji[207]), "aabaa", 2015),
            new Clanek(List.of(avtorji[160], avtorji[265]), "bbabb", 2015),
            new Clanek(List.of(avtorji[42], avtorji[337]), "aabab", 2010),
            new Clanek(List.of(avtorji[426]), "aabba", 2002),
            new Clanek(List.of(avtorji[229]), "aabab", 2019),
            new Clanek(List.of(avtorji[148], avtorji[75]), "aabaa", 2010),
            new Clanek(List.of(avtorji[254], avtorji[151]), "bbaab", 2000),
            new Clanek(List.of(avtorji[363]), "aaaaa", 2015),
            new Clanek(List.of(avtorji[211]), "baaaa", 2015),
            new Clanek(List.of(avtorji[148], avtorji[332], avtorji[354]), "aabbb", 2016),
            new Clanek(List.of(avtorji[155], avtorji[54], avtorji[340]), "abbba", 2005),
            new Clanek(List.of(avtorji[269], avtorji[90]), "aabab", 2003),
            new Clanek(List.of(avtorji[54], avtorji[265]), "aaabb", 2006),
            new Clanek(List.of(avtorji[60], avtorji[357]), "baabb", 2003),
            new Clanek(List.of(avtorji[499]), "bbaab", 2018),
            new Clanek(List.of(avtorji[31]), "aaabb", 2016),
            new Clanek(List.of(avtorji[51], avtorji[133], avtorji[317]), "aabab", 2005),
            new Clanek(List.of(avtorji[63]), "bbbba", 2008),
            new Clanek(List.of(avtorji[349], avtorji[109], avtorji[439]), "baaaa", 2012),
            new Clanek(List.of(avtorji[388]), "babbb", 2006),
            new Clanek(List.of(avtorji[38]), "aabba", 2015),
            new Clanek(List.of(avtorji[385]), "abaaa", 2007),
            new Clanek(List.of(avtorji[332], avtorji[167], avtorji[491]), "babab", 2004),
            new Clanek(List.of(avtorji[250], avtorji[319], avtorji[124]), "ababa", 2008),
            new Clanek(List.of(avtorji[293], avtorji[433], avtorji[257]), "babab", 2012),
            new Clanek(List.of(avtorji[389], avtorji[335], avtorji[280]), "babaa", 2002),
            new Clanek(List.of(avtorji[252], avtorji[98]), "abbbb", 2010),
            new Clanek(List.of(avtorji[490], avtorji[264], avtorji[424]), "bbbaa", 2005),
            new Clanek(List.of(avtorji[390], avtorji[311]), "baaba", 2000),
            new Clanek(List.of(avtorji[211], avtorji[93], avtorji[372]), "bbbaa", 2007),
            new Clanek(List.of(avtorji[238]), "babab", 2002),
            new Clanek(List.of(avtorji[58]), "aabbb", 2009),
            new Clanek(List.of(avtorji[412], avtorji[267]), "aabab", 2014),
            new Clanek(List.of(avtorji[36], avtorji[420]), "aabba", 2009),
            new Clanek(List.of(avtorji[480], avtorji[83], avtorji[120]), "abbbb", 2001),
            new Clanek(List.of(avtorji[232]), "aabba", 2002),
            new Clanek(List.of(avtorji[209], avtorji[200], avtorji[315]), "bbbab", 2012),
            new Clanek(List.of(avtorji[148], avtorji[288], avtorji[498]), "babba", 2019),
            new Clanek(List.of(avtorji[313]), "aabbb", 2014),
            new Clanek(List.of(avtorji[47], avtorji[104]), "babba", 2000),
            new Clanek(List.of(avtorji[330]), "bbbbb", 2009),
            new Clanek(List.of(avtorji[214], avtorji[282], avtorji[484]), "aabab", 2009),
            new Clanek(List.of(avtorji[301], avtorji[356]), "baabb", 2019),
            new Clanek(List.of(avtorji[169]), "aaaba", 2015),
            new Clanek(List.of(avtorji[193], avtorji[131], avtorji[0]), "abbbb", 2007),
            new Clanek(List.of(avtorji[351]), "bbbab", 2013),
            new Clanek(List.of(avtorji[431]), "abaab", 2018),
            new Clanek(List.of(avtorji[232], avtorji[45]), "abbbb", 2002),
            new Clanek(List.of(avtorji[243]), "aabba", 2010),
            new Clanek(List.of(avtorji[25], avtorji[125]), "aabaa", 2008),
            new Clanek(List.of(avtorji[389], avtorji[147], avtorji[210]), "bbbba", 2008),
            new Clanek(List.of(avtorji[460], avtorji[373], avtorji[111]), "bbaaa", 2001),
            new Clanek(List.of(avtorji[108], avtorji[310]), "bbabb", 2000),
            new Clanek(List.of(avtorji[394]), "baaba", 2002),
            new Clanek(List.of(avtorji[256], avtorji[123], avtorji[247]), "abbbb", 2002),
            new Clanek(List.of(avtorji[226]), "bbbbb", 2009),
            new Clanek(List.of(avtorji[207], avtorji[479]), "abbaa", 2016),
            new Clanek(List.of(avtorji[303], avtorji[262]), "baaaa", 2007),
            new Clanek(List.of(avtorji[301], avtorji[182], avtorji[179]), "abbaa", 2011),
            new Clanek(List.of(avtorji[466]), "abbbb", 2014),
            new Clanek(List.of(avtorji[388], avtorji[110]), "ababb", 2006),
            new Clanek(List.of(avtorji[55]), "bbbab", 2019),
            new Clanek(List.of(avtorji[374], avtorji[41]), "ababb", 2004),
            new Clanek(List.of(avtorji[380]), "abbaa", 2006),
            new Clanek(List.of(avtorji[204], avtorji[8]), "bbbab", 2008),
            new Clanek(List.of(avtorji[360], avtorji[20]), "babbb", 2016),
            new Clanek(List.of(avtorji[257], avtorji[137]), "babaa", 2018),
            new Clanek(List.of(avtorji[178], avtorji[25], avtorji[47]), "aaaab", 2003),
            new Clanek(List.of(avtorji[164], avtorji[443]), "abaaa", 2007),
            new Clanek(List.of(avtorji[187], avtorji[173]), "bbbba", 2013),
            new Clanek(List.of(avtorji[403]), "bbbaa", 2002),
            new Clanek(List.of(avtorji[17], avtorji[266]), "ababb", 2005),
            new Clanek(List.of(avtorji[215], avtorji[313], avtorji[14]), "aabab", 2014),
            new Clanek(List.of(avtorji[436], avtorji[438], avtorji[371]), "baaba", 2014),
            new Clanek(List.of(avtorji[476], avtorji[252], avtorji[48]), "aaabb", 2000),
            new Clanek(List.of(avtorji[492]), "ababb", 2004),
            new Clanek(List.of(avtorji[342], avtorji[430]), "abaab", 2014),
            new Clanek(List.of(avtorji[8], avtorji[479], avtorji[344]), "aaaba", 2016),
            new Clanek(List.of(avtorji[30], avtorji[304]), "aaaab", 2000),
            new Clanek(List.of(avtorji[123]), "bbbbb", 2016),
            new Clanek(List.of(avtorji[254], avtorji[388]), "babba", 2008),
            new Clanek(List.of(avtorji[369], avtorji[333]), "abbbb", 2000),
            new Clanek(List.of(avtorji[194]), "bbbaa", 2015),
            new Clanek(List.of(avtorji[80]), "babaa", 2006),
            new Clanek(List.of(avtorji[190], avtorji[144], avtorji[264]), "aabba", 2000),
            new Clanek(List.of(avtorji[23], avtorji[293], avtorji[54]), "babbb", 2006),
            new Clanek(List.of(avtorji[431]), "abbaa", 2018),
            new Clanek(List.of(avtorji[309], avtorji[264]), "bbabb", 2010),
            new Clanek(List.of(avtorji[46], avtorji[363], avtorji[121]), "abbbb", 2005),
            new Clanek(List.of(avtorji[444]), "bbbaa", 2002),
            new Clanek(List.of(avtorji[399], avtorji[210], avtorji[263]), "bbbbb", 2003),
            new Clanek(List.of(avtorji[495], avtorji[277]), "abbab", 2016),
            new Clanek(List.of(avtorji[478], avtorji[74]), "bbbba", 2003),
            new Clanek(List.of(avtorji[445], avtorji[311]), "baaba", 2001),
            new Clanek(List.of(avtorji[32]), "aabbb", 2010),
            new Clanek(List.of(avtorji[155]), "bbbab", 2002),
            new Clanek(List.of(avtorji[299]), "babab", 2005),
            new Clanek(List.of(avtorji[131], avtorji[477], avtorji[390]), "bbaab", 2011),
            new Clanek(List.of(avtorji[126], avtorji[60], avtorji[330]), "bbaab", 2014),
            new Clanek(List.of(avtorji[300]), "bbbab", 2005),
            new Clanek(List.of(avtorji[280]), "abbbb", 2003),
            new Clanek(List.of(avtorji[362], avtorji[378], avtorji[399]), "aaaba", 2004),
            new Clanek(List.of(avtorji[145], avtorji[453]), "aaabb", 2007),
            new Clanek(List.of(avtorji[37], avtorji[363], avtorji[220]), "baaba", 2009),
            new Clanek(List.of(avtorji[150]), "abbab", 2007),
            new Clanek(List.of(avtorji[360]), "bbbba", 2004),
            new Clanek(List.of(avtorji[378], avtorji[219], avtorji[427]), "babab", 2010),
            new Clanek(List.of(avtorji[207]), "baaab", 2012),
            new Clanek(List.of(avtorji[350]), "aabbb", 2003),
            new Clanek(List.of(avtorji[22], avtorji[329], avtorji[49]), "babba", 2002),
            new Clanek(List.of(avtorji[362], avtorji[45]), "bbbab", 2012),
            new Clanek(List.of(avtorji[419], avtorji[133], avtorji[496]), "babaa", 2005),
            new Clanek(List.of(avtorji[488]), "babba", 2010),
            new Clanek(List.of(avtorji[160], avtorji[454], avtorji[55]), "abbab", 2003),
            new Clanek(List.of(avtorji[435]), "bbaaa", 2004),
            new Clanek(List.of(avtorji[29], avtorji[325], avtorji[57]), "bbbab", 2016),
            new Clanek(List.of(avtorji[178], avtorji[419]), "bbaba", 2018),
            new Clanek(List.of(avtorji[317]), "ababa", 2017),
            new Clanek(List.of(avtorji[25], avtorji[330]), "aaabb", 2015),
            new Clanek(List.of(avtorji[244], avtorji[414], avtorji[292]), "aaaab", 2005),
            new Clanek(List.of(avtorji[113], avtorji[55], avtorji[158]), "bbaba", 2016),
            new Clanek(List.of(avtorji[244]), "bbaaa", 2000),
            new Clanek(List.of(avtorji[103]), "aaaaa", 2005),
            new Clanek(List.of(avtorji[322]), "bbaab", 2012),
            new Clanek(List.of(avtorji[188], avtorji[278]), "aabab", 2010),
            new Clanek(List.of(avtorji[492]), "aabbb", 2014),
            new Clanek(List.of(avtorji[251], avtorji[289]), "bbabb", 2008),
            new Clanek(List.of(avtorji[287], avtorji[164], avtorji[110]), "baaaa", 2019),
            new Clanek(List.of(avtorji[379]), "baaba", 2004),
            new Clanek(List.of(avtorji[407], avtorji[28], avtorji[23]), "bbbaa", 2001),
            new Clanek(List.of(avtorji[321]), "bbbaa", 2009),
            new Clanek(List.of(avtorji[193]), "bbaaa", 2011),
            new Clanek(List.of(avtorji[356], avtorji[187]), "bbaaa", 2018),
            new Clanek(List.of(avtorji[482]), "aabaa", 2016),
            new Clanek(List.of(avtorji[346], avtorji[204]), "babaa", 2015),
            new Clanek(List.of(avtorji[17]), "aabab", 2001),
            new Clanek(List.of(avtorji[101]), "aabaa", 2011),
            new Clanek(List.of(avtorji[435], avtorji[228]), "bbabb", 2011),
            new Clanek(List.of(avtorji[133]), "bbabb", 2017),
            new Clanek(List.of(avtorji[221]), "bbbbb", 2004),
            new Clanek(List.of(avtorji[156], avtorji[310]), "bbbbb", 2011),
            new Clanek(List.of(avtorji[211], avtorji[303], avtorji[370]), "aabbb", 2015),
            new Clanek(List.of(avtorji[382]), "aaabb", 2010),
            new Clanek(List.of(avtorji[237], avtorji[167], avtorji[20]), "baaba", 2010),
            new Clanek(List.of(avtorji[32], avtorji[323], avtorji[182]), "baaba", 2010),
            new Clanek(List.of(avtorji[488], avtorji[438], avtorji[136]), "aabab", 2019),
            new Clanek(List.of(avtorji[212], avtorji[464]), "baabb", 2005),
            new Clanek(List.of(avtorji[321], avtorji[151]), "bbaba", 2003),
            new Clanek(List.of(avtorji[49], avtorji[295]), "aabba", 2011),
            new Clanek(List.of(avtorji[268]), "bbaba", 2007),
            new Clanek(List.of(avtorji[105], avtorji[116], avtorji[328]), "babab", 2011),
            new Clanek(List.of(avtorji[34], avtorji[214], avtorji[130]), "abbaa", 2012),
            new Clanek(List.of(avtorji[24], avtorji[87]), "bbbaa", 2005),
            new Clanek(List.of(avtorji[27]), "aabba", 2019),
            new Clanek(List.of(avtorji[455]), "bbaaa", 2003),
            new Clanek(List.of(avtorji[387], avtorji[408], avtorji[332]), "bbaaa", 2017),
            new Clanek(List.of(avtorji[3], avtorji[135]), "bbbbb", 2012),
            new Clanek(List.of(avtorji[237]), "bbbaa", 2012),
            new Clanek(List.of(avtorji[285]), "baaaa", 2001),
            new Clanek(List.of(avtorji[428]), "abaaa", 2005),
            new Clanek(List.of(avtorji[366], avtorji[389]), "ababa", 2003),
            new Clanek(List.of(avtorji[231]), "abaaa", 2010),
            new Clanek(List.of(avtorji[341], avtorji[283]), "aaaaa", 2006),
            new Clanek(List.of(avtorji[107], avtorji[60]), "aabab", 2009),
            new Clanek(List.of(avtorji[217], avtorji[401], avtorji[330]), "abbba", 2002),
            new Clanek(List.of(avtorji[338], avtorji[444], avtorji[267]), "baaaa", 2019),
            new Clanek(List.of(avtorji[448]), "bbaaa", 2002),
            new Clanek(List.of(avtorji[143]), "aaaab", 2002),
            new Clanek(List.of(avtorji[96], avtorji[323]), "ababa", 2004),
            new Clanek(List.of(avtorji[333], avtorji[74]), "ababa", 2005),
            new Clanek(List.of(avtorji[193], avtorji[159]), "bbaab", 2004),
            new Clanek(List.of(avtorji[428]), "baaba", 2011),
            new Clanek(List.of(avtorji[327], avtorji[490], avtorji[121]), "baaba", 2014),
            new Clanek(List.of(avtorji[15], avtorji[2], avtorji[241]), "abaab", 2007),
            new Clanek(List.of(avtorji[398], avtorji[69]), "bbbaa", 2007),
            new Clanek(List.of(avtorji[353], avtorji[330]), "abbbb", 2017),
            new Clanek(List.of(avtorji[486], avtorji[238], avtorji[86]), "bbbab", 2006),
            new Clanek(List.of(avtorji[495]), "babab", 2011),
            new Clanek(List.of(avtorji[186]), "bbabb", 2005),
            new Clanek(List.of(avtorji[203], avtorji[373], avtorji[4]), "abbbb", 2018),
            new Clanek(List.of(avtorji[81], avtorji[186]), "ababa", 2015),
            new Clanek(List.of(avtorji[133], avtorji[237], avtorji[491]), "aabba", 2011),
            new Clanek(List.of(avtorji[153], avtorji[176]), "bbaba", 2004),
            new Clanek(List.of(avtorji[475], avtorji[485]), "abbaa", 2014),
            new Clanek(List.of(avtorji[473]), "abaab", 2018),
            new Clanek(List.of(avtorji[481], avtorji[389], avtorji[361]), "aaaba", 2015),
            new Clanek(List.of(avtorji[66], avtorji[148], avtorji[393]), "abbba", 2015)
        );

        Map<Avtor, List<Clanek>> avtor2clanki = Glavni.clankiPoAvtorjih(clanki);
        List<String> vrstice = new ArrayList<>();
        for (Avtor avtor: avtor2clanki.keySet()) {
            vrstice.add(String.format("%s -> %s", avtor, avtor2clanki.get(avtor)));
        }
        vrstice.sort(null);
        for (String vrstica: vrstice) {
            System.out.println(vrstica);
        }
    }
}
