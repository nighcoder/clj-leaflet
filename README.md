# clj-leaflet

A Clojure library for creating ipyleaflet widgets in clojupyter.

## Usage

See main-notebook for usage.

## Requirements
To build the package, you'll need to have installed: a JVM, lein, make, clojure and git.
To use the package you'll need to have installed: the Jupyter Package with the proper extensions.

## Installation
Clone the [clojupyter](https://github.com/clojupyter/clojupyter.git) package somewere on the disk:
```bash
$ git clone https://github.com/clojupyter/clojupyter.git
```
Enter the clojupyter directory and switch to `feature/ipywidgets` branch:
```bash
$ cd clojupyter && git checkout feature/ipywidgets
```
Copy the absolute path of clojupyter root directory to `clj-leaflet/deps.edn` on `:local/root`.
Back into `clj-leaflet` directory, after you updated deps.edn, run:
```bash
make install
```
At this point, you have a new clojure kernel installed as clojupyter-leaflet.

To view and interact with the models, you also need to install the right extension for your front end.
The main notebook was tested with **Jupyter Lab 2.0.1** with extensions **@jupyter-widgets/jupyterlab-manager v2.0.0** and **jupyter-widgets v0.12.6**.
For details, see the [ipywidgets](https://github.com/jupyter-widgets/ipywidgets) and [ipyleaflet](https://github.com/jupyter-widgets/ipyleaflet) instruction for installing the front end extensions.

## License

Copyright © 2020 Daniel Ciumberică

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED **AS IS**, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
