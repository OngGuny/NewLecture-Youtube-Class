package com.newlecture;

import com.newlecture.examlib.entity.Exam;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Eclipse Maven!" );
        //설정 변경은 pom.에서 
        //내가만든 lib~ 
        Exam exam = new Exam(10,20,30);
        System.out.println(exam.total());
        
        //install 외부의 lib를 local repository 에 저장하는거
        //deploy 내가만든 lib 를 외부 서버에 올리는거. 
    }
}	
//메이븐은 남이 만든 프로젝트 위에서 , 프로젝트를 플랫폼삼아 
//작업을 시작 할 수 있다
