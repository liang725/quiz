public class QSBean {
    private Integer id;
    private String question;
    private String optiona;
    private String optionb;
    private String optionc;
    private String optiond;
    private String answer;

    // 如果需要与数据库映射，还需要这些字段
    private Integer isDelete;
    private Date createTime;
    private Date updateTime;

    // Getters and Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }

    public String getOptiona() { return optiona; }
    public void setOptiona(String optiona) { this.optiona = optiona; }

    public String getOptionb() { return optionb; }
    public void setOptionb(String optionb) { this.optionb = optionb; }

    public String getOptionc() { return optionc; }
    public void setOptionc(String optionc) { this.optionc = optionc; }

    public String getOptiond() { return optiond; }
    public void setOptiond(String optiond) { this.optiond = optiond; }

    public String getAnswer() { return answer; }
    public void setAnswer(String answer) { this.answer = answer; }

    public Integer getIsDelete() { return isDelete; }
    public void setIsDelete(Integer isDelete) { this.isDelete = isDelete; }

    public Date getCreateTime() { return createTime; }
    public void setCreateTime(Date createTime) { this.createTime = createTime; }

    public Date getUpdateTime() { return updateTime; }
    public void setUpdateTime(Date updateTime) { this.updateTime = updateTime; }
}