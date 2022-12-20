package phoneticlearneroop;

/**
 * Class to represent a single letter in the alphabet,
 * with the correct phonetic word to go with it
 * @author Thomas Walton
 */


public class Question {
   
    
    String question;
    String answer;
    
    /**
     * Default constructor - Sets question and answer to empty string
     */
    public Question(){
        question = "";
        answer = "";
    }
    /** 
     * Parameter constructor, takes the question and answer as parameters
     * @param inQuestion
     * @param inAnswer 
     */
    public Question(String inQuestion, String inAnswer){
        question = inQuestion;
        answer = inAnswer;
    }
    /**
     * Sets the letter for this question
     * @param inQuestion takes in the letter
     */
    public void setQuestion(String inQuestion){
        question = inQuestion;
        
    }
    /**
     * Gets the letter for this question
     * @return the letter for this question
     */
    public String getQuestion(){
        return question;
    }
    /**
     * Sets the answer to this question
     * @param inAnswer takes in the phonetic word as the answer
     */
    public void setAnswer(String inAnswer){
        answer = inAnswer;
    }
    /**
     * Gets the correct answer for this question
     * @return the phonetic word for the letter
     */
    public String getAnswer(){
        return answer;
    }
    /**
     * Checks if user answer matches the answer to this question. This determines
     * if the user answered correctly.
     * @param userAnswer The user answer as the guess for the phonetic word
     * @return true if correct, false if incorrect
     */
    public boolean isCorrect(String userAnswer){
        String correctAnswer = answer;
        Boolean isCorrect = false;
        if(userAnswer.toUpperCase().equals(correctAnswer.toUpperCase())){
            isCorrect = true;
        }else{
            isCorrect = false;
        }
        
        
        return isCorrect;
    }
    

    
    
}


