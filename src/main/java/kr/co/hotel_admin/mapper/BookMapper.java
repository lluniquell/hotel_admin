package kr.co.hotel_admin.mapper;

import java.util.ArrayList;


import kr.co.hotel_admin.vo.BookVO;
import kr.co.hotel_admin.vo.RoomVO;

public interface BookMapper {
	public ArrayList<RoomVO> exceptroom(String checkin, String checkout, String person);
	public ArrayList<BookVO> list();
	public ArrayList<RoomVO> book1();
	public RoomVO book2(BookVO bvo);
	public void makebook(BookVO bvo);
	public Integer getCode(String sales);
	public BookVO book3(String salescode);
	public ArrayList<BookVO> list1(String userid);
	public void book_cancel(String salescode);
}
