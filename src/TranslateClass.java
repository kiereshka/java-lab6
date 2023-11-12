import java.util.HashMap;
import java.util.Map;

class TranslateClass
{
    private Map<String, String> englishDictionary;

    public TranslateClass() {
        englishDictionary = new HashMap<>(1, 2);
    }
    public void addTranslation(String englishWord, String ukrainianWord)
    {
        englishDictionary.put(englishWord.toLowerCase(), ukrainianWord.toLowerCase());
    }

    public String translate(String englishData)
    {
        String[] words = englishData.split(" ");
        StringBuilder ukrainianData = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < englishData.length(); i++)
        {
            char character = englishData.charAt(i);

            if (Character.isLetterOrDigit(character))
            {
                currentWord.append(character);
            }
            else
            {
                String translation = englishDictionary.get(currentWord.toString().toLowerCase());

                if (translation != null)
                {
                    ukrainianData.append(translation);
                }
                else
                {
                    System.out.print("\nНа жаль, такого слова немає у словнику. ");
                    break;
                }
                ukrainianData.append(character);
                currentWord.setLength(0); // Очищення слова
            }
        }

        String lastWord = currentWord.toString().toLowerCase(); // Обробляємо останнє слово у реченні
        String lastTranslation = englishDictionary.get(lastWord);
        if (lastTranslation != null)
        {
            ukrainianData.append(lastTranslation);
        }
        else
        {
            System.out.print("\nНа жаль, такого слова в довіднику немає. ");
        }

        return ukrainianData.toString();
    }
}