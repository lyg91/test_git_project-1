package work.model.service;

import work.model.dao.StudentDao;
import work.model.dto.Student;

public class StudentService {

	
	/**
	 * �Խ��� DAO Ŭ����
	 */
	private StudentDao dao = StudentDao.getInstance();

	
	
	/**
	 * ���丵 ȸ�� ���
	 * @param dto
	 * @return
	 */
	public int StudentInsert(Student dto) {
	
		return dao.insert(dto);
		
	}
	
	public boolean isUser(String id) {
		return dao.isUser(id);
	}
}
