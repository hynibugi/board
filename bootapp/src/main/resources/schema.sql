CREATE TABLE Board (
    pk INT NOT NULL AUTO_INCREMENT,
    nickname VARCHAR(10) NOT NULL,
    content VARCHAR(1000) NOT NULL,
    title VARCHAR(20) NOT NULL,
    importantcontent Boolean NULL,
    PRIMARY KEY (pk)
);
INSERT INTO Board (nickname,content,title,importantcontent ) VALUES ('testValue','내용','제목',true);