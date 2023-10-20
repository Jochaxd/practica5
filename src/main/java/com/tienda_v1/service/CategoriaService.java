package com.tienda_v1.service;

import com.tienda_v1.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //Se declara un método para obtener un ArrayList de Objetos Categoria
    //Objetos vienen de la base de datos, todos los registros
    
    public List<Categoria> getCategorias(boolean activos);
    
    //Abajo se colocarán los métodos para hacer el CRUD de categorias, pero en semana 6
}
