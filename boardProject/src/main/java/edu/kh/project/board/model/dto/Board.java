package edu.kh.project.board.model.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.kh.project.member.model.dto.Member;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Board {

	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private String boardWriteDate;
	private String boardUpdateDate;
	private int readCount;
	private String boardDelFl;
	private int boardCode;
	private int memberNo;
	
	// MEMBER 테이블 조인
	private String memberNickname;
	
	// 목록 조회 시 서브쿼리 필드
	private int commentCount; // 댓글 수
	private int likeCount; // 좋아요 수
	
	// 게시글 작성자 프로필 이미지
	private String profileImg;
	
	// 게시글의 썸네일 이미지
	private String thumbnail;
	
	// 게시글 좋아요 여부 확인
	private int likeCheck;
	
	// 게시글에 등록된 이미지 목록
	private List<BoardImg> imageList;
	
	// 게시글에 등록된 댓글 목록
	private List<Comment> commentList;
	
	
}
