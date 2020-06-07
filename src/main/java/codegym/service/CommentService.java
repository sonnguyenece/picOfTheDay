package codegym.service;

import codegym.model.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> showAllComment();

    Comment addComment(Comment comment);

    void addLike(Comment comment);

    void disLike(Comment comment);

    Comment findOne(Integer id);
}
