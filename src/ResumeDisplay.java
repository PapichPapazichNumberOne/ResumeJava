import javax.swing.JOptionPane;

public class ResumeDisplay {
    public static void main(String[] args) {

        String resume = "Имя: Данила Молотокв\nВозраст: 19 лет\n Образование: Среднее\nОпыт работы: 5лет";


        String[] resumeParts = resume.split("\n");


        int numberOfMessageBoxes = Math.max(3, resumeParts.length);


        int totalCharacters = resume.length();
        int averageCharactersPerPage = totalCharacters / numberOfMessageBoxes;


        for (int i = 0; i < numberOfMessageBoxes; i++) {
            int startIndex = i * averageCharactersPerPage;
            int endIndex = (i + 1) * averageCharactersPerPage;
            if (endIndex > resume.length()) {
                endIndex = resume.length();
            }
            String part = resume.substring(startIndex, endIndex);


            String title = "Часть " + (i + 1) + " из " + numberOfMessageBoxes + " (Среднее: " + averageCharactersPerPage + " символов)";


            JOptionPane.showMessageDialog(null, part, title, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
