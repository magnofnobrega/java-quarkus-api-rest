//package com.magno.produtosapi;
//
//import jakarta.ws.rs.GET;
//import jakarta.ws.rs.Path;
//import jakarta.ws.rs.Produces;
//import jakarta.ws.rs.core.MediaType;
//
//@Path("/produtos")
//public class ProdutoResource {
//
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String hello() {
//        return "Hello from Quarkus REST";
//    }
//}
package com.magno.produtosapi;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import jakarta.transaction.Transactional;

@Path("/produtos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoResource {

    @GET
    public List<Produto> listar() {
        return Produto.listAll();
    }

    @POST
    @Transactional
    public void criar (Produto produto) {
        produto.persist();
    }

    @PUT
    @Path("{id}")
    @Transactional
    public void atualizar(@PathParam("id") Long id, Produto produto) {
        Produto entity = Produto.findById(id);
        if (entity != null) {
            entity.nome = produto.nome;
            entity.preco = produto.preco;
        }
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public void deletar(@PathParam("id") Long id) {
        Produto entity = Produto.findById(id);
        if (entity != null) {
            entity.delete();
        }
    }
}