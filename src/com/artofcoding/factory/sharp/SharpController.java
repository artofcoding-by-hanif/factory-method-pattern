package src.com.artofcoding.factory.sharp;

import src.com.artofcoding.factory.Controller;
import src.com.artofcoding.factory.ViewEngine;

public class SharpController extends Controller {

    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
