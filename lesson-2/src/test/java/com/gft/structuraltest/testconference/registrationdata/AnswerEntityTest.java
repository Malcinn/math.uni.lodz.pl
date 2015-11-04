package com.gft.structuraltest.testconference.registrationdata;

import static org.junit.Assert.*;
import org.junit.*;

public class AnswerEntityTest{

	@Test
    public void shouldReturnTrueWhenObjectsAreTheSame(){
        AnswerEntity an1 = new AnswerEntity();
        assertTrue(an1.equals(an1));
    }
	
    @Test
    public void shouldReturnFalseWhenObjectIsNull(){
        AnswerEntity an2 = null;
        assertFalse(an2 != null);
    }
    
    @Test
    public void shouldReturnFalseWhenObjectsTypesAreDiffrent(){
        AnswerEntity an1 = new AnswerEntity();
        Integer int1 = new Integer(1);
        assertFalse(int1.getClass().equals(an1.getClass()));
    }
    
    @Test
    public void shouldReturnFalseWhenFieldAnswerTextIsNULL(){
    	AnswerEntity an1 = new AnswerEntity();
        an1.setAnswerText(null);
        assertFalse(an1.getAnswerText() != null);
    }
    
    @Test
    public void shouldReturnFalseWhenAnswersTextAreDiffrent(){
    	AnswerEntity an1 = new AnswerEntity();
    	AnswerEntity an2 = new AnswerEntity();
        an1.setAnswerText("cat");
        an2.setAnswerText("dog");
        assertFalse(an1.getAnswerText().equals(an2.getAnswerText()) );
    }
    
    @Test
    public void shouldReturnFalseWhenIdIsNULL(){
    	AnswerEntity an1 = new AnswerEntity();
    	an1.setId(null); 
        assertFalse(an1.getId() != null);
    }
    
    @Test
    public void shouldReturnFalseWhenIdsAreDiffrent(){
    	AnswerEntity an1 = new AnswerEntity();
    	AnswerEntity an2 = new AnswerEntity();
        an1.setId(1L);
        an2.setId(2L);
        assertFalse(an1.getId() == an2.getId() );
    }
    
    @Test
    public void shouldReturnFalseWhenQuestionsAreDiffrent(){
    	AnswerEntity an1 = new AnswerEntity();
    	AnswerEntity an2 = new AnswerEntity();
        an1.setQuestion(new QuestionEntity());
        an2.setQuestion(new QuestionEntity());
        assertFalse(an1.getQuestion().equals(an2.getQuestion()) );
    }
    
}