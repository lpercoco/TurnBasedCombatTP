package data;

import java.sql.*;
import entidades.*;
import utils.ApplicationException;

public class DataPersonaje {


	public void add(Personaje p){
		ResultSet rs=null;
		PreparedStatement stmt=null;
		
		
		try {
			stmt=FactoryConexion.getInstancia().getConn().prepareStatement(
					"insert into personajes(nombre,vida,energia,evasion,defensa)"+
					" values(?,?,?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS);
			// PreparedStatement.RETURN_GENERATED_KEYS to be able to retrieve id generated on the db
			// by the autoincrement column. Otherwise don't use it
						
			stmt.setString(1,p.getNombre());
			stmt.setInt(2,p.getVida());
			stmt.setInt(3,p.getEnergia());
			stmt.setInt(4,p.getEvasion());
			stmt.setInt(5,p.getDefensa());
			stmt.execute();
			
			//after executing the insert use the following lines to retrieve the id
			rs=stmt.getGeneratedKeys();
			if(rs!=null && rs.next()){
				p.setCodigo(rs.getInt(1));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null)stmt.close();
				FactoryConexion.getInstancia().releaseConn();
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
}
	public void update(Personaje p){
		PreparedStatement stmt=null;
		
		try {
			stmt= FactoryConexion.getInstancia().getConn().prepareStatement(
					"update personajes set nombre=?,vida=?,energia=?,evasion=?,defensa=?"+
					" where id=?");

			stmt.setString(1,p.getNombre());
			stmt.setInt(2,p.getVida());
			stmt.setInt(3,p.getEnergia());
			stmt.setInt(4,p.getEvasion());
			stmt.setInt(5,p.getDefensa());
			stmt.setInt(6,p.getCodigo());
			stmt.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(stmt!=null)stmt.close();
				FactoryConexion.getInstancia().releaseConn();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
	public void delete(Personaje p){
		PreparedStatement stmt=null;
		
		try {
			stmt = FactoryConexion.getInstancia().getConn().prepareStatement(
					"delete from personajes where codigo=?");
			stmt.setInt(1, p.getCodigo());
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(stmt!=null)stmt.close();
				FactoryConexion.getInstancia().releaseConn();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
}
	public Personaje getByNombre(Personaje per){
		Personaje p=null;
		
		
		PreparedStatement stmt=null;
		ResultSet rs=null;
		try {
			stmt = FactoryConexion.getInstancia().getConn().prepareStatement(
					"select codigo,nombre,vida,energia,evasion,defensa,PuntosTotales from personas where nombre=?");
			stmt.setInt(1, per.getCodigo());
			rs= stmt.executeQuery();
			if(rs!=null && rs.next()){
				p=new Personaje();
				p.setCodigo(rs.getInt("codigo"));
				p.setVida(rs.getInt("vida"));
				p.setNombre(rs.getString("nombre"));
				p.setDefensa(rs.getInt("defensa"));
				p.setEvasion(rs.getInt("Evasion"));
				p.setPuntosTotales(rs.getInt("puntosTotales"));
				p.setEnergia(rs.getInt("Energia"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				FactoryConexion.getInstancia().releaseConn();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return p;
}
	
}
