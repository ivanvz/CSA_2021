package Ch4Labs;

public class Count
{
    public static void main (String[] args)
    {
        String phrase; // a string of characters
        int countBlank; // the number of blanks (spaces) in the phrase
        int countA; // the number of As in the phrase
        int countE; // the number of Es in the phrase
        int countS; // the number of Ss in the phrase
        int countT;
        int countRest;// the number of Ts in the phrase
        int phraselength; // the length of the phrase
        char ch; // an individual character in the string

// Print a program header
        System.out.println ();
        System.out.println ("Character Counter");
        System.out.println ();

// Read in a string and find its length
        System.out.print ("Enter a sentence or phrase, quit to end: ");
        phrase = Keyboard.readString();

        while (!phrase.equals("quit"))
        {
            phraselength = phrase.length();

// Initialize counts
            countBlank = 0;
            countA = 0;
            countE = 0;
            countS = 0;
            countT = 0;
            countRest = 0;

// a for loop to go through the string character by character
// and count the blank spaces
            for (int i=0; i<phraselength; i++)
            {
                if (phrase.charAt(i)== ' ')
                    countBlank++;
                else if (phrase.charAt(i)== 'A')
                    countA++;
                else if (phrase.charAt(i)== 'E')
                    countE++;
                else if (phrase.charAt(i)== 'S')
                    countS++;
                else if (phrase.charAt(i)== 'T')
                    countT++;
                else
                    countRest++;

            }


// Print the results
            System.out.println ();
            System.out.println ("Number of blank spaces: " + countBlank);
            System.out.println ("Number of As: " + countA);
            System.out.println ("Number of Es: " + countE);
            System.out.println ("Number of Ss: " + countS);
            System.out.println ("Number of Ts: " + countT);
            System.out.println ("Number of Rest of letters: " + countRest);

//Get phrase for next time
            System.out.print ("Enter a sentence or phrase, quit to end: ");
            phrase = Keyboard.readString();
        }
    }
}