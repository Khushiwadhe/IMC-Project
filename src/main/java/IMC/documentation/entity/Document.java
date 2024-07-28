package IMC.documentation.entity;

public class Document {
	private int id;
	private String child_name;
	private String parents_name;
	private String hospital_certificate;
	private String status;
	private String comment;
	
	public Document() {
		super();
	}

	public Document(int id, String child_name, String parents_name, String hospital_certificate, String status,
			String comment) {
		super();
		this.id = id;
		this.child_name = child_name;
		this.parents_name = parents_name;
		this.hospital_certificate = hospital_certificate;
		this.status = status;
		this.comment = comment;
	}

	public Document(int id, String child_name, String parents_name, String hospital_certificate) {
		super();
		this.id = id;
		this.child_name = child_name;
		this.parents_name = parents_name;
		this.hospital_certificate = hospital_certificate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChild_name() {
		return child_name;
	}

	public void setChild_name(String child_name) {
		this.child_name = child_name;
	}

	public String getParents_name() {
		return parents_name;
	}

	public void setParents_name(String parents_name) {
		this.parents_name = parents_name;
	}

	public String getHospital_certificate() {
		return hospital_certificate;
	}

	public void setHospital_certificate(String hospital_certificate) {
		this.hospital_certificate = hospital_certificate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}