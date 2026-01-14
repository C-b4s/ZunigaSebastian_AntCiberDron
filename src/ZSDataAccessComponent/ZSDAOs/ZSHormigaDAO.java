package ZSDataAccessComponent.ZSDAOs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ZSDataAccessComponent.ZSDTOs.ZSHormigaDTO;
import ZSDataAccessComponent.ZSDTOs.ZSVWHormigaDTO;
import ZSDataAccessComponent.ZSHelpers.ZSDataHelperSQLiteDAO;
import ZSInfrastructureComponent.ZSAppException;

public class ZSHormigaDAO extends ZSDataHelperSQLiteDAO <ZSHormigaDTO>{

    public ZSHormigaDAO() throws ZSAppException {
        super(ZSHormigaDTO.class, "ZSHormiga", "IdZSHormiga");
    }

    public List<ZSVWHormigaDTO> zsReadAllvwHormiga() throws ZSAppException {
        ZSVWHormigaDTO zsDto;
        List<ZSVWHormigaDTO> zsLst = new ArrayList<>();
        String zsQuery = " SELECT IdZSHormiga "
                      +"  ,ZSTipo             "   
                      +"  ,ZSSexo             "
                      +"  ,ZSEstadoHormiga    "   
                      +"  ,ZSNombre           "
                      +"  ,ZSDescripcion      "
                      +"  ,ZSEstado           "
                      +"  ,ZSFechaCreacion    "   
                      +"  ,ZSFechaModifica    " 
                      +"  FROM vwZSHormiga ";
        try {
            Connection zsConn = zsOpenConnection();         // conectar a DB     
            Statement  zsStmt = zsConn.createStatement();   // CRUD : select * ...    
            ResultSet zsRs   = zsStmt.executeQuery(zsQuery);  // ejecutar la
            while (zsRs.next()) {
                zsDto = new ZSVWHormigaDTO(zsRs.getString(1) // IdZSHormiga
                                        ,zsRs.getString(2)   // ZSTipo            
                                        ,zsRs.getString(3)   // Sexo        
                                        ,zsRs.getString(4)   // EstadoHormiga 
                                        ,zsRs.getString(5)   // Nombre 
                                        ,zsRs.getString(6)   // Descripcion
                                        ,zsRs.getString(7)   // Estado
                                        ,zsRs.getString(8)   // FechaCreacion
                                        ,zsRs.getString(9)   // FechaModifica
                                      ); 
                zsLst.add(zsDto);
            }
        } 
        catch (SQLException e) {
            throw new ZSAppException("Ups... porblemas con la vista", e, getClass(), "getVWHormiga()");
        }
        return zsLst;
    }

}
