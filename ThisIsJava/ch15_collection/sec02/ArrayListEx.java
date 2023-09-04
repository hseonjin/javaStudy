package sec02;

import java.util.ArrayList;
import java.util.List;

class Board {
	private String subject;
	private String content;
	private String writer;

	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
}

public class ArrayListEx {
	public static void main(String[] args) {

		// ArrayList 컬렉션 생성
		List<Board> list = new ArrayList<>();

		// 객체 추가
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		// 저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();
		
		// 특정 인덱스의 객체 가져오기
		Board board = list.get(2);
		System.out.println(board.getSubject() + " " + board.getContent() + " " + board.getWriter());
		System.out.println();
		
		// 객체 삭제
		list.remove(2);
		list.remove(2); // 2번 인덱스를 삭제하면 기존의 3번 인덱스가 2번 인덱스로 변경되므로 다시 2번 인덱스를 제거할 수 있음
	
		// 모든 객체를 하나씩 가져오기 (향상된 for문)
		for(Board b : list) {
			System.out.println(b.getSubject() + " " + b.getContent() + " " + b.getWriter());
		}
	}
}
