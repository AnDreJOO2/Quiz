package szczapandrzej.quiz.entities;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "answer")
public class Answer implements java.io.Serializable{

    private static final long serialVersionUID = 1L;
    private Integer id;
    private Question question;
    private String content;
    private boolean correct;

    public Answer()
    {

    }

    public Answer(Question question, String content, boolean correct) {
        this.question = question;
        this.content = content;
        this.correct = correct;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Column(name = "correct")
    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
}
