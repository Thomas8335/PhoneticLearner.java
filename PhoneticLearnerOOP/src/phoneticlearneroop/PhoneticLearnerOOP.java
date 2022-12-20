package phoneticlearneroop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class PhoneticLearnerOOP {
    
    
    public static void main(String[] args) {
        
        Question[] questionArray = initializeQuestions();
        runQuiz(questionArray);
            
        
        
    }
    
    public static Question[] initializeQuestions(){
        ArrayList<String> alphabet = new ArrayList<String>();
        alphabet.add("A");
        alphabet.add("B");
        alphabet.add("C");
        alphabet.add("D");
        alphabet.add("E");
        alphabet.add("F");
        alphabet.add("G");
        alphabet.add("H");
        alphabet.add("I");
        alphabet.add("J");
        alphabet.add("K");
        alphabet.add("L");
        alphabet.add("M");
        alphabet.add("N");
        alphabet.add("O");
        alphabet.add("P");
        alphabet.add("Q");
        alphabet.add("R");
        alphabet.add("S");
        alphabet.add("T");
        alphabet.add("U");
        alphabet.add("V");
        alphabet.add("W");
        alphabet.add("X");
        alphabet.add("Y");
        alphabet.add("Z");
        Collections.shuffle(alphabet);
        
        String[] newArray = new String[26];
        for(int i = 0; i < 26; i++){
            newArray[i] = alphabet.get(i);
        }
        
        HashMap<String, String> phoneticKey = new HashMap<String, String>();
        
        phoneticKey.put("A", "ALPHA");
        phoneticKey.put("B", "BRAVO");
        phoneticKey.put("C", "CHARLIE");
        phoneticKey.put("D", "DELTA");
        phoneticKey.put("E", "ECHO");
        phoneticKey.put("F", "FOXTROT");
        phoneticKey.put("G", "GOLF");
        phoneticKey.put("H", "HOTEL");
        phoneticKey.put("I", "INDIA");
        phoneticKey.put("J", "JULIET");
        phoneticKey.put("K", "KILO");
        phoneticKey.put("L", "LIMA");
        phoneticKey.put("M", "MIKE");
        phoneticKey.put("N", "NOVEMBER");
        phoneticKey.put("O", "OSCAR");
        phoneticKey.put("P", "PAPA");
        phoneticKey.put("Q", "QUEBEC");
        phoneticKey.put("R", "ROMEO");
        phoneticKey.put("S", "SIERRA");
        phoneticKey.put("T", "TANGO");
        phoneticKey.put("U", "UNIFORM");
        phoneticKey.put("V", "VICTOR");
        phoneticKey.put("W", "WHISKEY");
        phoneticKey.put("X", "XRAY");
        phoneticKey.put("Y", "YANKEE");
        phoneticKey.put("Z", "ZULU");
        

        
        Question a = new Question(newArray[0], phoneticKey.get(newArray[0]));
        Question b = new Question(newArray[1], phoneticKey.get(newArray[1]));
        Question c = new Question(newArray[2], phoneticKey.get(newArray[2]));
        Question d = new Question(newArray[3], phoneticKey.get(newArray[3]));
        Question e = new Question(newArray[4], phoneticKey.get(newArray[4]));
        Question f = new Question(newArray[5], phoneticKey.get(newArray[5]));
        Question g = new Question(newArray[6], phoneticKey.get(newArray[6]));
        Question h = new Question(newArray[7], phoneticKey.get(newArray[7]));
        Question i = new Question(newArray[8], phoneticKey.get(newArray[8]));
        Question j = new Question(newArray[9], phoneticKey.get(newArray[9]));
        Question k = new Question(newArray[10], phoneticKey.get(newArray[10]));
        Question l = new Question(newArray[11], phoneticKey.get(newArray[11]));
        Question m = new Question(newArray[12], phoneticKey.get(newArray[12]));
        Question n = new Question(newArray[13], phoneticKey.get(newArray[13]));
        Question o = new Question(newArray[14], phoneticKey.get(newArray[14]));
        Question p = new Question(newArray[15], phoneticKey.get(newArray[15]));
        Question q = new Question(newArray[16], phoneticKey.get(newArray[16]));
        Question r = new Question(newArray[17], phoneticKey.get(newArray[17]));
        Question s = new Question(newArray[18], phoneticKey.get(newArray[18]));
        Question t = new Question(newArray[19], phoneticKey.get(newArray[19]));
        Question u = new Question(newArray[20], phoneticKey.get(newArray[20]));
        Question v = new Question(newArray[21], phoneticKey.get(newArray[21]));
        Question w = new Question(newArray[22], phoneticKey.get(newArray[22]));
        Question x = new Question(newArray[23], phoneticKey.get(newArray[23]));
        Question y = new Question(newArray[24], phoneticKey.get(newArray[24]));
        Question z = new Question(newArray[25], phoneticKey.get(newArray[25]));
        
        
        Question questionArray[] = new Question[26];
        questionArray[0] = a;
        questionArray[1] = b;
        questionArray[2] = c;
        questionArray[3] = d;
        questionArray[4] = e;
        questionArray[5] = f;
        questionArray[6] = g;
        questionArray[7] = h;
        questionArray[8] = i;
        questionArray[9] = j;
        questionArray[10] = k;
        questionArray[11] = l;
        questionArray[12] = m;
        questionArray[13] = n;
        questionArray[14] = o;
        questionArray[15] = p;
        questionArray[16] = q;
        questionArray[17] = r;
        questionArray[18] = s;
        questionArray[19] = t;
        questionArray[20] = u;
        questionArray[21] = v;
        questionArray[22] = w;
        questionArray[23] = x;
        questionArray[24] = y;
        questionArray[25] = z;
        
        return questionArray;
        
        
    }
    
    public static void runQuiz(Question[] questionArray){
        int correctCounter = 0;
        
        //loop through every letter of the alphabet
        for (int i = 0; i < 26; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.print("What is the phonetic word for " + questionArray[i].question +  "?: " );
            String userAnswer = scanner.nextLine();
            
            //compare user answer to correct answer
            boolean correct = false;
            correct = questionArray[i].isCorrect(userAnswer);
            if(correct == true){
                System.out.println("Correct");
                correctCounter ++; 
            }else{
                
                System.out.println("Nope, it's " + questionArray[i].answer);
            }    
           
        }
        //print results at the end
        System.out.println("You scored " + correctCounter + " out of 26.");
        
    }
    
}
