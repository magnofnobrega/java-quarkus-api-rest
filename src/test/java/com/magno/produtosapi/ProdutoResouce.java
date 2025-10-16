package com.magno.produtosapi;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/produtos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoResouce {

    @GET
    public List<Produto> listar() {
        return Produto.listAll();
    }

    @POST
    public void criar (Produto produto) {
        produto.persist();
    }

    @PUT
    @Path("{id}")
    public void atualizar(@PathParam("id") Long id, Produto produto) {
        Produto entity = Produto.findById(id);
        if (entity != null) {
            entity.nome = produto.nome;
            entity.preco = produto.preco;
        }
    }

    @DELETE
    @Path("{id")
    public void deletar(@PathParam("id") Long id) {
        Produto entity = Produto.findById(id);
        if (entity != null) {
            entity.delete();
        }
    }
}
