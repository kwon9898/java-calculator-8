package calculator;

import java.util.Arrays;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        
    	// 1.1 입력 문자열 받기
    	String input = Console.readLine();
    	
    }
    
    // 계산 메서드      
    public static int calculate(String text) {
    	
    	// 1.2 빈 문자열 예외처리
    	// 빈 문자열 입력 시, 문자열 구분 메서드 호출 안하기 위해서 calculate 메서드에 작성
    	if(text.trim().isEmpty() || text == null) {
    		return 0;
    	}
    	
    	return 0;
    	
    }
    
    // 입력한 문자열을 구분자 기준으로 나누는 메서드
    public static String[] splitText(String text) {
    	
    	return new String[0];
    }
    
    // 구분자 기준으로 나뉜 배열을 숫자로 변환 후 더하는 메서드
    // 유효성 검사 필요(1.3)
    public static int sumNumbers(String[] splitNumber) {

    	// 1.3 음수, 숫자 아닌 문자열 예외처리
    	for (String num : splitNumber) {  
    		// 문자열이 비어있는 경우
    		if(num.trim().isEmpty()) {
    			continue;
    		}
    		
    		try {
    			int number = Integer.parseInt(num.trim());
    			
    			if(number<0) {
    				throw new IllegalArgumentException("음수는 입력할 수 없습니다.");
    			}
    			
    		} catch (NumberFormatException e) {
    			throw new IllegalArgumentException("숫자만 입력 가능합니다.");   		
    		}
    		 
		}    	
    	
    	return 0;
    	
    }
    
    
}
