/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematouchstore.v2.Modelo;

/**
 *
 * @author ALBERTO
 * @param <S> Integer
 * @param <O> Objeto
 */
public interface DAO <S,O>{
    
    public boolean insert(O o);
    public boolean update(O o);
    public boolean delate(O o);
    public O obtenerPorUser(S k);
}
