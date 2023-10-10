// 정수형+문자열일 떄 연산이 필요하다면 int형

class Movie{
	int movieId;
	String poster,titleKr, titleEn;
	String relMovie;
	String genre;
	String nation;
	String grade;
	String time;
	double score;
	String boxoffice;
	String movieDetail;
}

class MovieArticle{
	int articleId;
	String poster,title;
	String articleDetail;
	String date;
	String pressCom;
}

class Category{
	int CategoryId;
	String poster,title;
	String sideTitle;
}

class Music{
	int music_no;
	String poster,title;
	String artist;
	String album;
	int like;
	int idcrement; //얼마나 상승/하강
	int rank;
	String state; //특수기호 업/다운
}

class Play{
	int playId;
	String poster,title,is_ing;
	String genre;
	String playDate;
	String place;
	String actors; //split()을 ,로 구분자로 자름
	String grade;
	String time;
}
public class 사용자정의클래스_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
