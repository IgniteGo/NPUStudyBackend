package com.hhstudygroup.npustudy.domain;

import java.io.Serializable;
import java.util.Date;

public class ExamPaper implements Serializable {
    /**
     * id: int
     * name: varchar(255)
     * subject_id: int
     * paper_type: int
     * grade_level: int
     * score: int
     * question_count: int
     * suggest_time: int
     * limit_start_time: datetime
     * limit_end_time: datetime
     * frame_text_content_id: int
     * create_user: int
     * create_time: datetime
     * deleted: bit(1)
     * task_exam_id: int
     */
    private static final long serialVersionUID = -4247069050907466723L;

    private Integer id;

    /**
     * 试卷名称
     */
    private String name;

    /**
     * 学科
     */
    private Integer subjectId;

    /**
     * 试卷类型( 1固定试卷 4.时段试卷 6.任务试卷)
     */
    private Integer paperType;

    /**
     * 年级
     */
    private Integer gradeLevel;

    /**
     * 试卷总分(千分制)
     */
    private Integer score;

    /**
     * 题目数量
     */
    private Integer questionCount;

    /**
     * 建议时长(分钟)
     */
    private Integer suggestTime;

    /**
     * 时段试卷 开始时间
     */
    private Date limitStartTime;

    /**
     * 时段试卷 结束时间
     */
    private Date limitEndTime;

    /**
     * 试卷框架 内容为JSON
     */
    private Integer frameTextContentId;

    private Integer createUser;

    private Date createTime;

    private Boolean deleted;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getPaperType() {
        return paperType;
    }

    public void setPaperType(Integer paperType) {
        this.paperType = paperType;
    }

    public Integer getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(Integer gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(Integer questionCount) {
        this.questionCount = questionCount;
    }

    public Integer getSuggestTime() {
        return suggestTime;
    }

    public void setSuggestTime(Integer suggestTime) {
        this.suggestTime = suggestTime;
    }

    public Date getLimitStartTime() {
        return limitStartTime;
    }

    public void setLimitStartTime(Date limitStartTime) {
        this.limitStartTime = limitStartTime;
    }

    public Date getLimitEndTime() {
        return limitEndTime;
    }

    public void setLimitEndTime(Date limitEndTime) {
        this.limitEndTime = limitEndTime;
    }

    public Integer getFrameTextContentId() {
        return frameTextContentId;
    }

    public void setFrameTextContentId(Integer frameTextContentId) {
        this.frameTextContentId = frameTextContentId;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "ExamPaper{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subjectId=" + subjectId +
                ", paperType=" + paperType +
                ", gradeLevel=" + gradeLevel +
                ", score=" + score +
                ", questionCount=" + questionCount +
                ", suggestTime=" + suggestTime +
                ", limitStartTime=" + limitStartTime +
                ", limitEndTime=" + limitEndTime +
                ", frameTextContentId=" + frameTextContentId +
                ", createUser=" + createUser +
                ", createTime=" + createTime +
                ", deleted=" + deleted +
                '}';
    }
}
