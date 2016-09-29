package work.model.service;

import java.util.ArrayList;

import work.model.dao.MentoringDao;
import work.model.dto.Mentoring;
import work.util.Utility;

public class MentoringService {

	/**
	 * �Խ��� DAO Ŭ����
	 */
	private MentoringDao dao = MentoringDao.getInstance();

	
	
	/**
	 * ���丵 ȸ�� ���
	 * @param dto
	 * @return
	 */
	
	public int Mentoringinsert(Mentoring dto) {
	
		return dao.insert(dto);
		
	}
	

	// �Խ��� ��ü��ȸ
	public  ArrayList<Mentoring> memtoringSelectList() {
		return dao.selectList();
	}

	// �Խ��� ����ȸ
	public Mentoring mentroingSelectOne(int mNo) {
		return dao.selectOne(mNo);
	}
	

	// ȸ�� �Խ��� ����
	public int boardupdateUser(Mentoring dto) {
		return dao.updateUser(dto);
	}
	
	// ������ �Խ��� ����
	public int boardupdate(Mentoring board) {
		return dao.update(board);
	}

	// �Խñ� ����
	public int deleteMentoring(int mNo) {
		return dao.deleteMentoring(mNo);
	}

	// �Խñ� �˻�
	public ArrayList<Mentoring> searchMentoring(String search, String searchName) {
		return dao.searchMentoring(search, searchName);
	}


}
