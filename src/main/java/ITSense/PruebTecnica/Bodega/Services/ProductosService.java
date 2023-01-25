package ITSense.PruebTecnica.Bodega.Services;

import ITSense.PruebTecnica.Bodega.ModelEntities.Productos;
import ITSense.PruebTecnica.Bodega.Repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class ProductosService implements ProductosRepository{

    private final ProductosRepository productosRepository;


    @Autowired public ProductosService(ProductosRepository productosRepository) {
        this.productosRepository = productosRepository;
    }

    @Override
    public List<Productos> findAll() {
        return productosRepository.findAll();
    }
    @Override
    public List<Productos> findAll(Sort sort) {
        return productosRepository.findAll(sort);
    }

    @Override
    public void deleteById(Integer integer) {
        productosRepository.deleteById(integer);
    }

    @Override
    public void delete(Productos entity) {
        productosRepository.delete(entity);
    }

    @Override
    public <S extends Productos> S save(S entity) {
        return productosRepository.save(entity);
    }
    @Override
    public List<Productos> findAllById(Iterable<Integer> integers) {
        return null;
    }
    @Override
    public void flush() {

    }

    @Override
    public <S extends Productos> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Productos> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Productos> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Productos getOne(Integer integer) {
        return null;
    }

    @Override
    public Productos getById(Integer integer) {
        return null;
    }

    @Override
    public Productos getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Productos> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Productos> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Productos> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Productos> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Productos> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Productos> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Productos, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }



    @Override
    public <S extends Productos> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Productos> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }





    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Productos> entities) {

    }

    @Override
    public void deleteAll() {

    }



    @Override
    public Page<Productos> findAll(Pageable pageable) {
        return null;
    }
}
