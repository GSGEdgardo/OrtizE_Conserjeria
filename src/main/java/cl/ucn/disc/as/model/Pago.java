/*
 * Copyright (c) 2023. Arquitectura de Sistemas, DISC, UCN.
 */

package cl.ucn.disc.as.model;

import io.ebean.annotation.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import java.time.Instant;

/**
 * The Pago class.
 *
 * @author Edgardo Ortiz Gonzalez
 */
@Getter
@ToString(callSuper = true)
@AllArgsConstructor
@Builder
@Entity
public class Pago extends BaseModel {

    /**
     * Fecha Pago
     */
    @NotNull
    private Instant fechaPago;

    /**
     * Monto.
     */
    @NotNull
    private Integer monto;
}