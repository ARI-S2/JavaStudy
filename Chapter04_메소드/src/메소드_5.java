/*
 * 1. 반복이 많은 경우
 * 예)
 * 	  데이터 추가
 *      = 오라클 연경
 *      = 데이터 추가 처리
 *      = 오라클 닫기
 *    데이터 수정
 *      = 오라클 연경
 *      = 데이터 추가 처리
 *      = 오라클 닫기
 *    데이터 삭제
 *      = 오라클 연경
 *      = 데이터 추가 처리
 *      = 오라클 닫기
 *    데이터 검색
 *      = 오라클 연경
 *      = 데이터 추가 처리
 *      = 오라클 닫기
 * 2. 다른 클래스 연결
 *    ------------ 웹
 * 3. 재사용 
 *    ---- 기능을 한가지만 수행하게 만듬
 *    
 * 3명의 학생의 국어, 영어, 수학 => 총점, 평균, 학점 , 등수
 * 
 * => 자바 / 오라클 / HTML / CSS / JavaScript
 * ----------------------------------------
 *        ㅣ  R       파이썬(개인)
 *  jsp / spring / spring boot  ==> 서버단(백엔드)
 *  DBCP  MyBatis  JPA
 *  -------------  ------
 *    오라클         mysql
 * => DB연동
 *    -----> 웹 흐름 => Front(jquery, ajax)
 * => Spring => 라이브러리 (기능) => (VueJS => VueX)
 * => 실무에서 사용하는 기술 => (ReactJS => Redux)
 *                    
 * 
 */
// 응용 => 

import java.util.*;
public class 메소드_5 {
    static void userInput(int[] kor,int[] eng,int[] math,
    		int[] total,double[] avg)
    {
    	Scanner scan=new Scanner(System.in);
        for(int i=0;i<kor.length;i++)
        {
        	System.out.print((i+1)+"번째 국어 점수:");
        	kor[i]=scan.nextInt();
        	
        	System.out.print((i+1)+"번째 영어 점수:");
        	eng[i]=scan.nextInt();
        	
        	System.out.print((i+1)+"번째 수학 점수:");
        	math[i]=scan.nextInt();
        	
        	total[i]=kor[i]+eng[i]+math[i];
        	avg[i]=total[i]/3.0;
        }
    }
    static void scoreChonge(double[] avg,char[] score)
    {
    	for(int i=0;i<score.length;i++)
        {
        	switch((int)(avg[i]/10.0))
        	{
        	case 10:
        	case 9:
        		score[i]='A';
        		break;
        	case 8:
        		score[i]='B';
        		break;
        	case 7:
        		score[i]='C';
        		break;
        	case 6:
        		score[i]='D';
        		break;
        	default:
        		score[i]='F';
        	}
        }
    }
    static void rankChange(int[] total,int[] rank)
    {
    	for(int i=0;i<3;i++)
        {
        	rank[i]=1;
        	for(int j=0;j<3;j++)
        	{
        		if(total[i]<total[j])
        		{
        			rank[i]++;
        		}
        	}
        }
    }
    static void print(int[] kor,int[] eng,int[] math,
    		int[] total,double[] avg,char[] score,
    		int[] rank)
    {
    	for(int i=0;i<3;i++)
        {
        	System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-5c%-5d\n",
        			kor[i],eng[i],math[i],total[i],avg[i],score[i],rank[i]);
        }
    }
    static void process()
    {
    	int[] kor=new int[3];
        int[] eng=new int[3];
        int[] math=new int[3];
        int[] total=new int[3];
        int[] rank=new int[3];
        char[] score=new char[3];
        double[] avg=new double[3];
        // 주소 값을 넘겨주므로 리턴값이 필요 없다 => 값이 변경되어 자동으로 저장됨
        userInput(kor, eng, math, total, avg);
        scoreChonge(avg, score);
        rankChange(total, rank);
        print(kor, eng, math, total, avg, score, rank);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}