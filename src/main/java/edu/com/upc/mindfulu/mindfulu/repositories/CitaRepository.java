package edu.com.upc.mindfulu.mindfulu.repositories;
import edu.com.upc.mindfulu.mindfulu.entities.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Integer> {

    // Buscar una cita por tipo de cita
    @Query("select c from Cita c where c.tipoCita = :tipoCita")
    List<Cita> buscarPorTipoCita(@Param("tipoCita") String tipoCita);

    // Contar citas por estado
    @Query("select count(c) from Cita c where c.estadoCita = :estadoCita")
    int contarPorEstado(@Param("estadoCita") String estadoCita);
    
}
