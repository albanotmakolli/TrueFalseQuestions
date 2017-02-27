package Det1;

import java.util.ArrayList;

/**
 * Created by VALA on 2/24/2017.
 */
public class QandA {

    ArrayList<String> questions = new ArrayList<String>();
    ArrayList<String> answers = new ArrayList<String>();

    public QandA() {
        fillQ();
        fillA();
    }

    public void fillQ() {

        questions.add(0,"Objektet janë instanca të një klase.");
        questions.add(1, "Tipi String është tip primitiv i të dhënave.");
        questions.add(2, "Emri i klasëve preferohet të fillojë me shkronjë të vogël.");
        questions.add(3, "Konvertimi i një numri nga double në int ruan vlerën e saktë te tij.");
        questions.add(4, "Klasët nuk kanë çasje në metoda publike të klasëve tjera.");
        questions.add(5, "Java është gjuhë programuese e orientuar kah objektet.");
        questions.add(6, "Numri 22/7 është më afër vlerës së saktë të numrit pi se sa numri 3.14");
        questions.add(7, "Variablat statike janë variabla të lidhura me objektet.");
        questions.add(8, "Çdo klasë e re e jona është nje tip i të dhënave, përkatësisht tip i referencës.");
        questions.add(9, "Fjala kyçe int përdoret për deklarim të variablave që mbajne karaktere.");
        questions.add(10, "Metodat private të një klase mund të çasen nga nënklasat e saj.");
        questions.add(11, "Interface-at janë tipe të referencës të përbëra vetëm nga metoda abstrakte.");
        questions.add(12, "Fjala kyçe extends detyron klasën të specifikojë implementimin e vet për secilën metodë të superklasës së saj.");
        questions.add(13, "Variablat mund të lihen të painicializuara.");
        questions.add(14, "Metodën konstruktor e posedojnë vetëm klasët abstrakte.");
        questions.add(15, "Një klasë mund të përdoret vetëm një herë.");
        questions.add(16, "Fjala kyçe import mundëson përdorimin e metodave të klasëve tjera që gjenden në paketa/librari të ndryshme.");
        questions.add(17, "Java është gjuhë programuese primitive.");
        questions.add(18, "System.out.print() është e njejtë me System.out.println().");
        questions.add(19, "Command Line përdoret për të shfaqur pjesë të programit grafikisht për përdoruesit.");
        questions.add(20, "Një program preferohet të ketë sa më pak klasë me sa më shumë metoda brenda tyre.");
    }

    public void fillA() {

        answers.add(0,"E Saktë");
        answers.add(1, "Gabim");
        answers.add(2,"Gabim");
        answers.add(3, "Gabim");
        answers.add(4,"Gabim");
        answers.add(5, "E Saktë");
        answers.add(6,"E Saktë");
        answers.add(7, "Gabim");
        answers.add(8,"E Saktë");
        answers.add(9, "Gabim");
        answers.add(10,"Gabim");
        answers.add(11, "E Saktë");
        answers.add(12,"Gabim");
        answers.add(13, "Gabim");
        answers.add(14,"Gabim");
        answers.add(15, "Gabim");
        answers.add(16,"E Saktë");
        answers.add(17, "Gabim");
        answers.add(18,"Gabim");
        answers.add(19, "Gabim");
        answers.add(20,"Gabim");
    }
}
