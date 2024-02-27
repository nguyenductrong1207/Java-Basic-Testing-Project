package testing.project.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import testing.project.project.entity.Triangle;

@Service
public class TriangleService {

    List<Triangle> listTriangle = new ArrayList<>();

    public List<Triangle> generatedTestcases() {

        

        return listTriangle;
    }

}
