package job_3;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyConverter {
    NumberFormat formatUS = NumberFormat.getInstance(Locale.US);
    NumberFormat formatUK = NumberFormat.getInstance(Locale.UK);
    NumberFormat formatEurope = NumberFormat.getInstance(Locale.FRANCE);
    NumberFormat formatRussia = NumberFormat.getInstance(new Locale("ru", "RU"));
    double PoundsSterlingInDollar = 0.851;
    double EurosInDollar = 0.965;
    double RublesInDollar = 60.57;

    //public String convert()
    // todo: 2 вида аргументов: через int с указанием валют и через locale
}
