package testing.project.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import testing.project.project.repository.TriangleRepository;

@Service
public class TriangleService {

    @Autowired
    private TriangleRepository triangleRepository;

}
