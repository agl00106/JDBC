package com.example.demo;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class DAOJdbc implements DAOInterface {
	
	private JdbcTemplate jdbcTemplate;
	@Autowired
	public void setDataSource(DataSource dataSource) {
	this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	private final RowMapper<UsuarioDTO> mapper = (rs,numRow) -> {
		UsuarioDTO usuario = new UsuarioDTO();
		usuario.setId(rs.getInt("id"));
		usuario.setNombre(rs.getString("nombre"));
		return usuario;
		};
	
	public List<UsuarioDTO> leeUsuarios(){
		//String sql = "SELECT * from usuarios";
		List<UsuarioDTO> usuarios = this.jdbcTemplate.query("SELECT * from usuarios", mapper);
		return usuarios;
	}

}
