package br.com.infox.arquivo;


import java.io.Serializable;
import java.util.List;


public interface IFileDAO<T extends Serializable> {

    void save(FileEntity entity);

    List<FileEntity> findAll();

    FileEntity find(String year, String month, String name);
}

