package pe.edu.vallegrande.project.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "provedor")
public class Provedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_provedor")
    private Integer idProvedor;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "telefono", nullable = false, length = 9)
    private String telefono;

    @Column(name = "gmail", nullable = false)
    private String gmail;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "compras_id_compra", nullable = false)
    private Integer comprasIdCompra;

    @Column(name = "state")
    private String state;

}
