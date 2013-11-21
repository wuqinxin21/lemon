package com.mossle.auth.domain;

// Generated by Hibernate Tools
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Perm .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "AUTH_PERM")
public class Perm implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private Oper oper;

    /** null. */
    private Resc resc;

    /** null. */
    private String code;

    /** null. */
    private String name;

    /** null. */
    private String scopeId;

    /** . */
    private Set<RoleDef> roleDefs = new HashSet<RoleDef>(0);

    /** . */
    private Set<Access> accesses = new HashSet<Access>(0);

    public Perm() {
    }

    public Perm(Resc resc) {
        this.resc = resc;
    }

    public Perm(Oper oper, Resc resc, String code, String name, String scopeId,
            Set<RoleDef> roleDefs, Set<Access> accesses) {
        this.oper = oper;
        this.resc = resc;
        this.code = code;
        this.name = name;
        this.scopeId = scopeId;
        this.roleDefs = roleDefs;
        this.accesses = accesses;
    }

    /** @return null. */
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OPER_ID")
    public Oper getOper() {
        return this.oper;
    }

    /**
     * @param oper
     *            null.
     */
    public void setOper(Oper oper) {
        this.oper = oper;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESC_ID", nullable = false)
    public Resc getResc() {
        return this.resc;
    }

    /**
     * @param resc
     *            null.
     */
    public void setResc(Resc resc) {
        this.resc = resc;
    }

    /** @return null. */
    @Column(name = "CODE", length = 200)
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     *            null.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** @return null. */
    @Column(name = "NAME", length = 200)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Column(name = "SCOPE_ID", length = 50)
    public String getScopeId() {
        return this.scopeId;
    }

    /**
     * @param scopeId
     *            null.
     */
    public void setScopeId(String scopeId) {
        this.scopeId = scopeId;
    }

    /** @return . */
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "AUTH_PERM_ROLE_DEF", joinColumns = { @JoinColumn(name = "PERM_ID", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "ROLE_DEF_ID", nullable = false, updatable = false) })
    public Set<RoleDef> getRoleDefs() {
        return this.roleDefs;
    }

    /**
     * @param roleDefs
     *            .
     */
    public void setRoleDefs(Set<RoleDef> roleDefs) {
        this.roleDefs = roleDefs;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "perm")
    public Set<Access> getAccesses() {
        return this.accesses;
    }

    /**
     * @param accesses
     *            .
     */
    public void setAccesses(Set<Access> accesses) {
        this.accesses = accesses;
    }
}
