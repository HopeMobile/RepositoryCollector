import com.hopedevelops.repositorycollector.Repository

interface RepositoriesView {

    // Show List of Repositories
    fun showRepos(repositories: List<Repository>)

    // Show Error Message if Repositories can't be loaded
    fun displayError()

    // Show Progress Bar while loading data
    fun displayProgressBar()

    // Hide Progress Bar after loading data
    fun hideProgressBar()
}