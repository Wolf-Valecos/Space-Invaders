package com.phoenix.spaceinvaders.entity.instance;

import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.Image;

import com.phoenix.spaceinvaders.entity.SIinvader;
import com.phoenix.util.ResourceUtil;

/**
 * Space Invader representing the top row.
 * 
 * @author William
 *
 */
public class SItop extends SIinvader
{

    protected final static int defaultValue = ResourceUtil.getInt( SItop.class, "value", 30 );

    protected static final Image defaultAlive = ResourceUtil
            .getImage(
                    SItop.class,
                    "SItop0.gif",
                    "R0lGODlhHgAYAPcAAP///xz/HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACwAAAAAHgAYAAAIYAAFCBxIsKDBgwgTKlzIsKHDhw0BSAQAUeFEihUNXryYkeDGiR0FfPyYceRGiBxFglQp0WHKlysZmjTpcibJii0H5gy5UyVPjDBLAl3ZU+ZQj0cjJhWYs2jIp1CjSmUYEAA7" );

    protected static final Image defaultAliveAlt = ResourceUtil
            .getImage(
                    SItop.class,
                    "SItop1.gif",
                    "R0lGODlhHgAYAPcAAP///xz/HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACwAAAAAHgAYAAAIYQAFCBxIsKDBgwgTKlzIsKHDhw0BSAQAUeFEihUNXryYkeDGiR0FfPyYceRGiBxFglQp0WHKlysZmjTpcibJhy1ZYsyJcudKnhExWhS6EChCo0WJelQa9CjTkFCjSp3aMCAAOw==" );

    protected static final Image defaultDestroyed = ResourceUtil
            .getImage(
                    SItop.class,
                    "SIinvaderBlast.gif",
                    "R0lGODlhHgAYAPcAAP///xz/HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACwAAAAAHgAYAAAIZgAFCBxIsKDBgwgTKlxoEAAAhhAHOozY8GHBiRItMsRIkKMAjxs1HvQI8qLIih1PjlRJUiXCki1fOnRJMWXJmjhX3sz5cabMlCghxjQZEmjCnQKH/qSoNGPEpklpFuW5lKrVqwkDAgA7" );

    protected static final AudioClip defaultSound = ResourceUtil.getAudio( SItop.class, "SIshipMove.wav", "" );

    protected static final AudioClip defaultDestroySound = ResourceUtil
            .getAudio(
                    SItop.class,
                    "SIshipHit.wav",
                    "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mJuLfHp+f35+c2BhcHmAf3t7eHmIk4V1d3t5cmx2iJOWmJmRhYGKlZ2ps66jmpeowsrBp3lKLzNVeoyduMnBpImEjZCEen+Mjn9tYldFNzU6TGqHpMLRx6+jts7Bk3N9kYx1Zmp2gouEdW9tZmBZTUdWepaIY01LU1tXSkRBP0ZINik5XICVjndyhZSXmKKztJl+bE0mEhIbLk9vdWphYWVscWpjYl9bVE1MVGJyiZSJbE9Pa4SGdWp0hol/cF5ST12FrsLCvrOelJmnv8u9nHVVOygnNUllgpWis7y3tLm4t7/I0Nni4cyxmYJ0d4WLh4WJkZeLcV1VXGFkcH+HlJyJZlx7jYF5hp2xvb+4t77Cx8vHwr+0mn1nU0tedGpQSVZhYltGNz9OYG1nYGBibH2Ee2lYVVZQV3mZo5R5Z2VpbG90en96bm13enZ0b2hrd4KMlZ+imo59al9gZWdbQyscHzxcb36GgXt3eY+wvbGjoJyPhISFfXh/jJWfrb7P0L+toqGlp5+NemRJPkpWU01LQjc1QFyCl5OLjp2xuKucoLnQy6+PeGpgWFBDMSgqLzdFU2d6gX13d3p5d3FlXVtYUUxQYYCow8vHtZuJhISFfm9iZHJ7dWhpdXdhQzhGWmVsdHh8g4BxYltXUUhNa5W2xsOulIeLmqy3vLu2s6+rp52bmY17bGt1eXd4eX2GiIOBfnh2dXiFj4uMmqqzt7aup6KhpqijjWVFPDtCWHSEiZGerL7LzcvLxrajk4uQoLHAzc2xf1dQZn+TnZ6SeGhsc3d0X0Q+UWZ4hXtZPTg6NzdEWXCBi5Wmtbmxpqavsq6sr7vDtJJ6bmVkanN1bW10dHFxdX6Ik56qraiqsKqYjIqCcGJeYF1ZW2V2gn53fIKEiI2RkZGSlp6kpqKVgm9iYWdrZ1dGPzw9R1txgouLiY2MgYWes7GYc1hWbI6rtKufmI97YUo/QEdPVVpfZnB7hIeFhYF3dXyDhoiKh39/hYF3aF5haXN/gnlxdoeRi4OEjJSZnJaGfnx0bW9zd3Zwa2dmZWFoeYeSmJiWlJSapK+1trGpp6ehlYmCgYSIiomHiYyDeHVya2BTSUhVant5aV5ianN9iJmosLOup6CYlJOXobC2raSgm5eQgGtdWVROTVBNTFdmb25wfYeGhIaJiomNl6OmoJWKho2erq6gk4+QinZgWF5od4WFg4eMlZqXj4J4bmBTS0ZMV2R2h5CMg35+gIWNlJWTj4h+dm1hV1BMSUlMU1daYGVueYCAfHVwcnZzZE0+PEBFR0I9RlhpdXuBjp2psa2gmpqVjIJ7e4OKh4GAfG1dVlZbZGppampmY2ZtdYKOkpSZmpqalo+Lj5WSi4KAi5mms72+vL29urvAw8G+wMPHxbitqaqqoZCCfHt9f397dnR3fIOMl6GrsrW3urizs7zCwL68uru7tauhm5qam5qVi4B8enNnW1ZTU1tjZ2lmXVdaYWRreIePkZWbl4h9eXqBjZWRgm9eTT89Sltnb3mEi4yJgHVubGllYF9jZmRgXl5haXJ4enp4dHByeIGIiIeGgX18f4OIi4uGf3t8gIWJiYmHhoqNh395cmpjXFxjamppbHJ2dnJxb2tteH15cWddVVdgaXKAjZOTk5aXlZGQlqGprK2onpOLhoSEiZKZm52el5CTmp6cmJmalpCNi4V8dnFvc3mAhYiKjI+Rj4+TmqCqsbCtqqSck4yIiY+Vk4yHg394cnN5e3Zycnh/hImNj4yGgH5/gHZiTTwqFwsRIS86RVFdZ3WCjZidm5WPj5KSkJCWo663vb23qZeLjpiXjIFyXkk6OkBIUVlfYFM9MztKU11obnBxdn18d3l/g4WKmq27w8W/ta6rrK6urq6rpp+XkY+RlpiTkZOXnJ6doKSop6CVi4R4bWpscnl+gIKDh4+Ym5SNiomMkJKQjpOfqq6ppJ2Qg3p3e4GDf3lsW05EQ05danJuZFtTTU5ccoeYnpeNio2OkZaan6Wmp6qrpJqMe29rb3JxbmlkX1hSUVFSVllbXmRrcXFpZmtxcnN3fHx6eHJsa290d3yEj5ieoJuWmZ2dnZ6cmJWUlJWbo6ekm5OPiIOHjpGUlpSQjoyLi4qGho2RjYuPl5+kop6Vi4WCe3d6fn59gIeKhoOEgXhvbG9yc3BsaGZrcHR1dHFvcnh8fX15eHx/gYKBgYGAgIKHi46NioaCgYmTm52Win1ybXaEjpOUkIqIiIV8cWtxfYaHhoN8eX2Cg4F+d29oXlRQUlhkdIOMjYiBe3t/goaHg4F9d3Z7hYyNkJWWkYuMk5yosbe3r6SXjIR/foaVoKKajYJ9e3p5e3x5dG9tcXZ3d32FiYeDfXp7e32CjJSWlZidoqOhoqKemZWSj4qFgXpzcW5raWtxeHx8e3p4eXx5b2hmaXByamFjbHR5f4eMjId+dnV7hpCVlpeQfm1nam1vdHuDio6Qj4+Mhn9zZ2NnbnBwc3qEioiDfHRubnJzc3mDi5GTj4qFgoODgXt1cW9yd32FjpSSjIF2cXR6hI2Tko2DdmpnbHN3eHyBhYyWoKano6GhnpOEd29pZGJnc4GLjYiDfXl3eX+KmaCbkIeAend2d32JmaevqZqOiISEh4aFi5KTjIN3Z1ZDMyggIzJGWWt+kqO0u7iyrqigmpWRkZGOhXZpZm9/kJ6nq6yusbGqn5aQkJKXnqasrqyklYZ8eHd6gYmPjo2Ql5+mqqurqquusrS1saqim5WQkJWepaiop6SgnpuSh4B9e3ZtaGltc3qCh4eEgHhva21wc3V0dnh2c3FsY1xaX2VscnNwbWliWVFTXGZweX9+dnFzdHFua2pqbHB0c3Jzd32FkJmakYFyaWRiZGtycm1mZWlucHBvbmtoaW90dXZ1c3V6fXp2c3R2dnFnXFVVXWp1ent5eoWVo6ynloV5c3RwYk8+NDQ/UGJudXl6e4CHjpSbnZuWkIuFfndxcHV3dnd6enJlWVFPVVxgZnKDl6awt7iyqqWkoqKpr66on5eLemlbUlJaY2hqbniKn62topeOiYeGhoF5cXF3fHlzbmtpa3aLnquwr6eckomBeXFoXlZXX2hucXR2d32GkZmcnJ+nsri1rqadk4d9eHRvb3J2eHt/hYySlZWVlpeYnKChn56blY+Jgn2AhIeIiIeHiIuOj4yHiI+Tj4Z/fH+EhoWCgoeLi4eEgHl0dXh5eHh5fYGFi5KZnJeMf3VxdHp7d3FtamptcXqChoqNkpmfnpiRjYiDfnh0cnFwcnR2eoCCgX5+gISEgoKBf317fYOKkZSSkI+LhHx4eXp4c25sbW9xcnN3gIyXmJOLhHtxamtxdnZ0dXqAhYmMjo6Pj4yIhoSDhIeJiYiHiY2Tl5aTkIuGgoGAf3t5fIOJkJibmZWSkpGOi4uNjIqLioeHhoSBfnx+goaJiomIhoKAgIOHiYeFgHt0bm5vbm5vdX+FiYuMiYeIi4uJiIeBend6foWMkZCMhoB+fXl1cnFzd36GjZCRj4yKh4F7dHBzen+Ag4mMjImCfnt5d3VycnJ1en19fHp6enl3dHFxc3V3eHh3dXRzcnFvb3J1d3h3dXNzdnuAhIaGg314d3h5eXh5eHVydHl/goGBg4aHhoWDgoGBgoOEg4B9fH1/gYKEh4mKi4uJhoeLkZKQjYyOkI6MjI6QkY+OjY6QkY2Gg4OHjJCVmJmcnpuVkZGTk5KRjYiHiY2QkJKWmpqXko6MioR/fn58d3BqaWpvd3+Dg4OAfHh1cWxqa2tpZWRkZGRkZWZlZGZpaGdlZGRmam5wcXN2eXp5d3RuaWpucnR4fYKFhoeGhIB9e3l1c3d8gIWJjI2MiYeFhISEhIOBfnt5eHd3d3h6foGDhYWDhIWHiYmIiImLjIyNjo6LiYiJi4yMioeEgXx5eHl5eXh4d3V3eXt7fHt6e3p3c3JybmppaWlqbG9uamhsdHp9f39+e3h3d3h6e3p7e3t9fn15dnJvb3V+hIaEgX19fXt5dnV2eHyCiIyLiIWDg4ODgH18e3p6e3p+hIiJhoB9fHx9fX1+fn+DhYJ9e3t5d3d6gIWKjI2Pk5ialpGLiIeGhoiKiomFgoOIj5aZl5WUk5CNioR+fH2AgHt6foGEhYeIhYOEhYaEg4KChYqNjo2JhIB/gIKEiI2Oi4mIiIR9eXd4eXyAhomJhH13cm5ucXd8goiNjYiCfnx8fn99e3l5enp5eHh6eXh4enx8dm9vc3Z2dnd8goeIjZijqaqopqSfm5iShnluaWZfVk1HR01VYXCAjZagr8HQ2uDf08Oxo5uXkIRzYlVKQkFGTlRbZnmOnKSpqKKZko+PjIiEgHx4c29wdHyDhYSHjJOZn6SqsLKtpJmQioR/e3l4eX6Eio2OkJGOioWDgn98eHNtZWBgY2drc3uAg4aIhYB6dW1kXFhZYGlyeHl5eXp7fHt5eHt+goWIiYV9c2lfWFFLRklTYnF/iI2Rk5CLiIWDg4F/e3NnXFRNRkNFSlFWXGVxe4KHjJKYnJmUkpSXlY2FhIiMj5CSko6IhIB9enVvaWNbVVFSWWFreoyerrvBwr65tK+oop2XkYh/eHFsamprb3Z8fn9+enVxb3Bzdnh6fHx7e3p5eHh5fH6BhYiIhYF/fn18eXZ1dnh5eHVwbGlqa21vb29ubW1ubnFzdXd3dnZ1cW9vb25ucHFzdnl7eHNubGppZ2VmaGtweH6DhYeIiIWCgH+ChYaGh4mLioeCf318e3t9f4OMlJeWkYyEfHVvbGtpamxvdX2ChYeKi4uQlpmZlY+KiIqLjImFhIeLjY2OkZWZmJSPjY2Oj5GUlJOSjomDf357eXh7f4GBf4CDhYeGiIqLjI6QkpGPjo2LhX98foGDgoB9fX9/gIOHjZSWko2IhYKAgYWLj5CRkpOQioF3cHBzdnl9goaIh4SAfXh0cW5tcHV4d3RxbWpqamtrbXR6f4SHiIeFgX5+f4B/fn19fXx8fn+Bg4eJiImKjIyLi4yMiYeHiImHhISIjpKUl5qeoaCcl5SSjoeAe3l6fHx8e3t+f4GDhYWEg4OFh4eGhoaEgHt4dXNydHd4eXl4dXJyc3V3d3Z0cnFzc3RzcnFyc3R1dXV0dHZ5fH+BgH14c29vcnZ5e3t6eHZ2eX2BgoOGh4WBfXp4d3Z1dXZ4eXl5eHh5e3+DiIqJiIaDgYSJjIqKiYiIhoSDhoyQkI6MjIyMioaCf35+fn15d3d3eHh4eXt7fHt6enl3dXNycnFwcXJ0d3l6e3t7eXd4enyBhYmMjo+NioaEgoB9enl3dXRxcG9ucXZ5enl4d3RxcHFzdXVybmhnaWpoZWNhXl9jZWdoaGZkZmlsbnBsZFtYWlxdXWBlam5xcnFvcXV5foaOlJaWlZGJgHduaGZobnR6f4WKj5abnqCdl5KPjpKZoKSlpaOhnpmSiH96en+Fi4+Pi4R+enuBiZGYnaKnrbGysLG0ub/Cv7ivpZyUjIaCgoSJjZCRkpKUlZidoaaopqKfnZyeoKGgnZqYl5eZmJSOiYSCgoSFhoWEhYaKj5KQi4eEgoB/fXl2cm5sZ19VTklGRktUYXGAjJeeoaGgoaGfm5WNhX11al5TSkRDR0xSVlhZWlxeY2pxeHp4dXFubGtrb3R5f4OEgHhxbmxqaGdnZmNeWllaXF5iZmtwd4GGhX1zbGloZ2RiYWJjY2FhZWtzeoGGh4WDgX59fX5+e3h1cGphWFNSU1ZcYWRmaGtvcXR4enp6fHx7end2dXNydHmAhIJ9end0cnBwcG9wc3V0cnN0dXZ2dXd6e32BhIaJh4OCg4WGhoWEg4SFh4yRlJSRjYmGhIWFhoSDhIeJioqLi4uJiIiJi42OjY2OkpSUko+NjIuJiIaCfnx8fYGEhoiLjY2MiYaFh4iJiYmJiYqKi42Oj4+Ni4mHh4qOkZGSk5WWmJiVlJOTlZeZmJeUkpGRkI+OjY2MjIuMjY+Pjo2MioqJiIeIioyOjYqIhYOBgH58enp7fHx+f4CAgICAgIGAf318e3l4eHl6eXh5eXl6eXh3dnZ3d3h5fX9/fX19fX19fHt7enp6e3t6eXl6enl6ent7fH1+f39/gIB+fHt7eXd2dnd4eXl5eXp8fX59fHt7ent9f35+fn9+fn5+fXt2dHV3e3+ChIOAfXx6enx+gYOGiIiHiImKiISAf35/goOFhYOCgH58fHt5d3Rzc3Z6foKEhYaGhoWFhIOAfnx7enl4eHZ0c3N1eHh4d3Z2dnZ2eXyAhYmLi4uKiomIiIiIiImKiomHg4GAf35+fX19fXx9f4GCg4F/fn19fX59fXx9foCChIWFg4B8end2dnZ2eXx9fXx7e3p5eHVxcHBxcW9tbGxucXJ0dnd4enp6e3x+f359fX17enh2c3Fwb29vb25ubm9xc3V3d3d3eHp8fn+AgYGCg4SEhYWEgoGAf39+f4GCg4SDhISEhYaGhoaFhIOEhoeHh4eIiImJiYqLjY+Qk5SUkpGQkZKUl5mYmJmXlJCOjo6Ni4iHhoWGh4aEgoF/fXt5eXt9fn9/gYWGhYODg4SDgoGBgH9+fn9/gIB/fHh1c3Jyc3V3enx9fX18e3l3dnV0dHV4enp5d3Nua2hmZWVkY2RlZ2dnZ2hqbHB0eX2AgICAgH9/fn5+fHt7fH6BhIaHh4iIiIiJi4uLi4qJh4SCgYKDhIWGh4iHhoWEg4F/f4CBgYGBgoSGiImKiYeFhISFhYeHh4eIiIiJiYiGhYaHiIiGhoWFhIWEg4F+fHt6eHd2dXV1dnh7fX17enp6e3t7fHt8foCCg4J/e3h1c3NzdHZ3d3V0c3JxcnNzc3R2eXt8end1dHR0d3p9f39/fXp4d3Z1dHR1dnh5eHd3eXt+gYSGh4eHiImJiIeGhYaGhYSDgoKDg4ODhIODhISFhoiLjY6PjoyLiomHhoaGh4iJiYiHhoaGh4qLjIyLioiHhIGAf35/gIGChIaIiYmJioqLjpCSk5STkY6MjY2Njo6MiYeFhISDgoKDgn9+fX5/gYKChIaGhoSDgX9+fXt6eXh3dnZ3eXt+gICAf35+fHp2dHJxcHBxcG5qZ2JeW1pbXF1dXV5dXFtZWFhZW15hZWdqbG5vb25ubW1ub3J2eXp7enl5d3Z0cnFycXJzdHZ4e36Ag4WGhoSBfn5/f3+AgIGChIeJiomLjY2NjYyNjYqIhoaGhYSDgYCAgYKEhYaHiYiGh4eIiYmJiIiJiIiHh4iKi42Ojo6OjYuJh4aGhoeJioyNj5CRkpWXmJmamZiXlZSUlZWUkpGPjYuKioqLi4yNjIyMjIuJiIeHh4aFhYaIiIeGhIJ/fXx8fHt7fX+Af3x5eHZ1dHR2eHt9fXx7enp6eXl6fX+AgYKCgoKDhYeHh4WFhYWGh4mLi4uKiIeHiIqKiouMjpCQkJCOi4qKiomIh4aEg4OCgoGAfn19fn9+fHx8fXx8e3x+gIKBf318e3t6eXh2dXR2d3d3dnNwbGhlY2FhYmRmaGpra2pnZWVmaGttbGpoZmRhX15fYGNmZ2lsb3Bwb2xramppaGdnZmZmZmdoamxvcXJ0dnh5e31/gIGAgICAgIB/fn+Bg4OEhISFhoeHiIuPkJGRkZCPjo2Li4uNj5CRkZCQj46MjI6Pj46Ojo6QkJGSk5SVlJKRkZCPjYyKiIeHiIqLi4uMjY2MioqJiYiHhoeJiYiHhoaGh4iHhoaGhoWCfnt6enp6fH6Ag4WHiIeFgn56dXNzdnd6foKGiImKioiGhISEhYaHiImJiYiIh4aGiIqMjo2MjI2NjImHhIKBg4eMkZWYmZeUkI6Mi4mGhoeIiIeGg398fH1+gYSHi4qIhYOCg4OCf3x5eXp9gIOFhoN+eHNubW1vcnR3fICBgHpyaWRiZWtyeYCEhoeIiYiFgn57eXl6fH5/f315dnNxcXFycnJzdHZ4ent6enp6eXh5eHh3d3l8f4OFhIB8d3R0dHd6e3t6eXl4d3Z3eXt9f4GChIWEg4GBgYOEhoaFg4KBf39/f399e3l4eHh4d3d5fH5+fXp5eHd3eHh7foGCgoKDg4SFh4eIiYqIhoOAf35+gIKEhoeGg398e3p4dnRzdHR2dnV0dHV3eXt8gIOEhYaGhoSBfHh1cm9samprbG5wcXFyc3R1d3h5eHZzc3V4ent9fn+Bg4SEgXx3c3FwcHJ2d3l6enx+f39+fXx9fn9/fnx8e3x/gYKDhISFhoeIiIiJiomJiIeGhYSEhYaFhoeHh4iJioqIhoWEhIWGh4aEgoCAgoWJjZCPjImFg4WHiYyPk5WTkI2LiouNj5KWmp2cm5iUkY+Pj5CQj46MiomKioqHhYSFh4uPkI+Ni4eFhIWIioqJhoSBfXt6e3x+gIGCgoOFhoWDgH19fXx9fn9+fnx6eHZ0cm9tbW1vdHl+goOBfnp3dXZ4eXp5eXd2dnh6fHt5d3h6fYGEhIKBgH99e3p6eHd4eHp7fH18e3p6e3x9fn5+fX1/gIB+fnx7enl4eHh5e31/fnp4d3d4eHl5ent7ent9gIKDgoB9ent8fX+BgYGBgYGCgX9+fX+ChIWFhIOBgH9/f4CBg4SEg4OCgYCAfn5+f4CAgYKDgoKCgoGAgIGBgIB/f35+fXt5eHd3d3h5fICChIaGhoSBfnx7fHx7enh2dXV0dHR1dXV2eHt8fn+AgH57eHVyb25vcHJzc3R1dnh6enl4e36AgIB/fXp5enx+gYOEhYaGh4aFhYSDhISEg4F+fHh2dnh7fYCChIaHh4iKjI6QkpKRkZCQkZGPjYmHhIB9eXZ0dHV4e31/f359e3t8fX5/f35/gICBgoODhYaHhoaFhYWGh4mKioqJiIaEg4WHiImKiomIiIeGhISEhISDgYGBgYGChIeLkJSXmZiUj4uGgXx4dXJwcXJzdnl+g4iOlZuipqmsrq2qpZ6XjoV9dW5oZWRkZGVnaWxvc3d6fH+BhIaJjI6PjYuKi4yMi4uIhIB+fHt8fH1+gICBg4WHiYmIiouMjIqJh4WDgYB/f3+AgYOEhISCgoKDhomLi4uLiomGhIKAf318enh1cm5qaGdobHJ3fH6BhIWGiIyQkpKRkpKRj4uFgXx4dHBsaGJeXF1gY2dqbnFzdnd4ent7e3t7enp5eHZ1dHNycXBwcnV4eXl5d3Zzb25vcHBxc3N0dXRxb21sbG91en6BgoSEhYeLjY2Mi4qKi4qJh4SBfn18fX6BhIWFhoiKjIyMjIuKiouMjo6Oj5CQkZGSk5SUlJKQjoyNjY6OjYyMjIyMjIuJiIaGhoaFhIODhYeIi42QkJCQj42Mi4uLioqKiYmIh4eGhYSCgoGBgoF/fHp5e35/gICAfnx7eHd4eXp7fHt7enh3dXV1dnd4eHh4d3Z2dnVzcnJycXJ0dXV2dnZ0c3JycnN0dHNycXFyc3R2d3l7fHx7eHZ0c3NycnR0dHV1dnd5ent9fX18e3t5d3d4eXp7e3t7e3x+gIOFhYSEhYSDgoKCgoOEhYaFhIWEg4F+fX18fHx9fn9/fXt6e3t8fH1/gYaJi4qJh4WDgX99e3t7e3x8fX5/gIGBgYGAf358endzb2xqamtsbG1ucHFxc3V3en2Ag4WGh4eGhIF+fHp5eHl5e319fX17eXZ0c3JxcnR2d3p9goaJjI6PkZOUlZWUk5GPjImHhIOEhYaIjI+QkI6KhYF+fX5/g4eKi4uIhYOBgH+BhYeKjI6QkpSWmJmam5ydnZyamJSRj46OjIqJiIiKjY2NjY2MjY2Oj4+Pj46OjY2NjY2MjIyMi4qKioqKiYmKiouLioiHhYSEhYWFhYWDgoKDhIaHiYyPkJKUlJSSkY6LiYeFg4KAf358enl5enx/goSFhYWFhoaGh4iIiImKi4uJh4SCgYGCg4ODhISEhISFhISCf3t4dnRzcnJzdHNxbm1tb3Fzdnh6fICBfnt4dnVzcGxoY1xVTklFQkJER0tPVVxja3R8gYSHjZKXmpqZl5KLgnpzb25tbGllYV5cXFxdXmBkaW5xc3R1dXZ4ent8fXx7e3x/goWJjI2Mi4mIiImJiouKiIWBfXx7eHRycXFxcG5saWdmZ2xyeHx+gYWLkJSXlZOQj42LiIaDgoB/fHt6enx9foGEh4mKjI2Nj5KTlJWUk5GOjIqJiIaDgH+AgYB/f4CBgoSEhIWGh4iIh4aGhoWDgYCBg4SEhIJ/fXp4d3d6fH19fH19fX18e3p6enp5dnNwbWtrbXJ3fIGFiImJioqLjIyLiYaFhYWFhYSCgH9+f4KGiImIiIiJi4yMi4qJioyPkpWXlpWTj4uJh4aFhYWEg4OEhoeHhoaGhYaGhYSEgoGBgoSHi4yNj4+QkpWXmJmamZiWlJGNioiGg4F/f3+AgYGCg4SFhYOCgoKChIWGiImJiYqLjIyMi4qHhIGAfn19fHt7e3t6eXh2dXR0dHV2d3l7fH1/f39+fHp5eHd2dHJxcHFycnJycnJzdXd3eHd2dXNycnJycnFycnN0dnd4eHh3eHh3dnVzb2xqaGhnZmZnaGlqamtqaWdmZmdpa25vcXN2eXx/g4aKjI6Ni4iGg4B9e3l4d3V0cnFwcG9vbm1ucHJ0dnd4eHh4eHp7fH1+f35/gIOFiIqNjo6Ojo6OjIqJh4aFhISEg4KAgH+AgoODgoGBgoOEhISFhYWFhIODg4ODg4ODhIWGh4iIiYmJiYqLjIyMi4uLi4yMjIuKiomKi42NjIyNjo+Rk5SVlpaWlpaWlpWVlZaWl5eWlZOTkpCPjoyKiYeGhoaFg4ODg4ODg4OCgYGBgoKCgoKBgYCAf359fX1+fn9/f4CBgoKDg4SFhoaHiIiIh4eHhoWEhIWFhYWEhIODg4OCgYGBgoKBf3x7enl3dXR0dHV1dXZ4eHh5eXt9f4GCg4SFhoaFg4B8eXZ0c3Jyc3R1dnZ1dXV1dHV2dnd5e3x8fXx7e3t7enl4eHh3d3d2dXRycXBwcXFzdXZ2dnRzcnJyc3RzcnJzc3RzcnBtbGxsbnBydHR0dHR0dHJwbm1tbGtqampqamprbG9zd3t9f4KEhISDgYGBgH9+fXt5dnNxcHFyc3R1dnh6fHx7enp6eXl4dnV0dHR1d3p8fX6BhYqOkZOUlJSVlpeXlpWTkI2JhIB9e3h2dXRzcnN1eHt+goWHiImLjY+QkZOUlpiampmYlpSTk5KRj42Mi4uLi4uMjo+QkI+Pjo2Njo6Oj5CPjoyLjI6PkZOTkpKSkpOUlpaWlZSSkZCPjY2NjY2Ojo6NjIqJi42Pj46MioqMj5KUlZWUkpGQjYmGhIOFh4mKioeFg4F/fXx8fHx8fHt7enp4eHh6fH5/gYOFhoeHh4eHiImKi4qKiYiGhIKAfn19fHx8e3p4dnRzc3V4ent6ent8fX19fXx7enp6ent7e3t7e3t8fHx9fHx8fX19fX19fHt5eHd3eHh5enp6e3p5eXh3dnZ2dXV1dnV1dnd4eXl5enp5eXl5eXl5eXh3dnR0dHR1dXV0c3NzdHV1dnd3d3d2dnV1dXV0dHV1dXZ2d3h4eXt8fX59fHt6eHZ0cnJyc3R0dHNzdHV2d3h5eXp7fH1+fn18fH1/gYOEhYSEg4KBgH9+fX5/gIGCgoB+fXx8fHt7e3x+f39/f39+fn18foCBgH9/fn5+fn19fHt6eXh4en1+fn58eXd1dHV1dnh5enp8foCBgoKAf4CBgX96dnJubG1xdXh6e3l4eHl7fX17ent8fX+AgYGChImMjIqEfXdybm1tbm9wcXN0dXZ2dXV1dnd6foOIj5aco6qws7Kvq6inpKCcl5KOi4eFhISFh4mMkJWZnJqXlJSUk4+If3l2dnl9gIOHiYmJioyPkpaao6+7wb60qJ2Vj4qEfnZwa2hmZ2hqbW9zeIGLlqClqKuusrW4t7OrpJ2YlJCNiYV/eG9mX1lWVldZW2Bma3F3fIGHjZKYnJ+hoZ6bmJaVlpiZmJeTjoeBenNtZ2NgXl9iZ2tub25tbnBxcnN0dHR0d3uBh4uNjYuJiIWDgH17eHZzcXBvb25tbG5wcnNzdHV3eXx+f4CAgYGAf359fXp3c3BtbGxsbG1vb29ubWxtbm9vcHFyc3V2d3d1cm9samlqbG5xdXh6fHx6eXl5enx+gYKCgYB+fXp3dXV2eHl7fX18fH1+fn5+f3+AgIGCg4ODgoF/fXx7fH6Ag4aIioqJiIeGhYaIioyOj5CQjouIhIF/fn+BgoKCgoGBgICAgYGCgoODgoB9e3p5ent+gYKDhYWFhoWEg4KCg4ODg4OCgX99fHt7e3t6ent9f4KEhYaGhoWEhISFhoiJi4yOj5CQkJCOjY2NjY2MjIyLiomJiIiJiouMjY6PkJGRkJCQkI+Pj42Mi4qKiouMjIqJiIeGh4iIiIeHh4eGhYSCgYCAgYKDg4ODg4ODhISEhYaGh4eHhoaFgoB/f35/gH9/f39/f4CAgH99fHt7enp5eXl4eHh4eHh3dnd3eHh4d3Z1dHN0dXd4eHh4eHd4eHl6eXl5eHZ1dXV1dXV2d3d2dXRzdHR1dXV0dXZ2dXR0c3NzdHV1c3JycnN0dXV1dXZ3d3h4d3h5eXl6e3t7e3t5eHd2dHJxcHBwcXJ0d3l8foCAgH9/f39+fn59e3p6eXh4eXp6e3x+f4CBgYGAgIGBgYGBgYGBgH9+fX1+f39/fn5+f359fX1+f4GDhIaGhoWEg4KCgoOEhISEhYSEg4KCg4SFhoeGhIKAf39/gIGCgoKCgYGCgoOEg4KCgYGBgIB/f3+AgH9+fX18fX+BgoOEhYaHh4eGhoWDgX9/f3+AgoSFh4iIiIiHh4aGhoaGh4iIh4aGhYWFhYSEg4KBgICAgICBgICAf39/f39/f39/f4CBgoOEhYaHiYqLi4uLioiGhYSDgoKCgoKCgYGBgH9/fn5/f3+AgIGAgH9+fn18e3p7e3t8fn9/f39+fn5+fn19fX18fHx8e3t6enp6e3t7e3t7enp7fHx8fHx9fn9+f39/gICBgoODgoKBgIGAgYGBgYGBgYGBgYB/fnx7e3t6e3t8fHx7fHx8e3p5eXl6e31+f4CAgYGBgICAf35+fn18fHt6ent8fn+BgoKCgoKDg4ODg4SFhYSEgoKBgYGBgoSFhISEhYaGhoaHiIiJiIaEgoF/fn19fX18fH1+f3+BgoSGiImJiIeGhYSEg4ODhISFhYSEg4OCgoKDhISEg4KBgH9/f35+fn5/f358e3p6e3x9fX19fX5/gIKDg4KCgYB/f4CAgIGBgIGBgYGCgoKDgoKBgYGBgYB/fn59fn9/gIGAgIGBgYGAf35+fn6AgH9+fXt6eXl5enx9fn5/gYKDg4OEhYWFhISEhISEhIODhIWFhIOCgYKEhoeIiIiGhYSEhYWEhISEhISDg4ODg4OCgoKDg4ODg4KBf39+fn1+f3+AgIB/fn59fn5/f4CAgYOFhoaFhYSDgX99e3p5eHl6ent8fX5/f3+Af39/f359fHp4eHd3d3d4eHd3d3Z2dnVzcnJzdXd4ent7e3t6eXl5eXh3dnZ1dXV2dnZ3d3h3dnZ3eXl6enp6eXh4eXp7fX6AgIB/fXx6eXh4eHh5enx9fn+AgYGBgYB/f35+f4B/f359fHt6e3x+f399e3l3dnd3eXt8foCCg4WFhIOAfnt6enp7foCChIWGhYWEg4KDhIWEgoB8enl6e32AgoSGhoWEg4GBgoOEhIWEg4KCg4WHiYuMjYyKiIaFhYaHh4eHh4eHiIqMjo+Pjo2Mi4qIh4aHh4eIiYmJiYqKiYmIh4aGhoeJi4yNjo2Ni4iGhISDg4ODg4KBgH9/f39/f35+fn+Af35+fX5/gIGChISEhISEgoGAfn6AgYKEhoiJioiGg4B+fXx9fn5+fXx7fH1/gYGBgH58e3h3dXR0dXd5fH+AgYGBgoGBgYB+e3h1dHR0dnd4eHl4eHh5enx9fXx8fHt7enl6fH1+f4CAgYGAfn19fn+BgYOEhISDgYCAgIGAgIGAgIGBgYGAgIGBgoKBgX99fHt5ent7fHx8e3t7e3t8fX19fHx7e3t7e3t7e3t8fHx9fX5+fn5+fX19fn5+fX6AgYGBgYB/fn59fXx8fX5+f4GCg4OCgYGBgYGCgYCAgH9/gICCg4SEhISDgoGBgICAgICAgYKDg4ODg4KCgoKCgYCAgIGCgoKCgoOEhYeIiYmIiIeHh4eGhoWEhIOCgYB+fX19fHx8fHx8fH1+f4CBgYGBf359fHx8e3p6eXl6fH1/f39/gICAgICAgICAgIGBgH99fHx8fH19fX5+fn9/gICBgYGBgYKDg4ODg4KBgH9+fX5+fn5+fn9/gICBgYKDgoKCgoGAf39+fn9/gIGBgYCAgIB/f39/f39/fn59fHx8e3t8fXx8fHx8e3x8e3p6eXh3d3d2dnd3eHh4d3Z2dnd5enp6fH19fn59fH19fX19fX5+f39+fn19fX5+f39/gICAgH9/f35+fX18fH5/fn5+fn1+f39+fX1+fn+AgIKCgoKCgoGBgYGBgoKBgX9+fHt7fH1+f4GDhYWGhoWFhYWEhIOCgYCAgH9/f4CBgoKBgH9+fn+AgYGBgYGBgYB/f39/gIKDg4SEg4KBgICAf3+AgICBgYKDg4KCgoKDhIWGhYSDg4KDhIWFhYWFhoaFhYSEg4KCgYKCgYGBgH9+fX19fXx7enp5ent8fX1+fn5/f3+AgICAgICAgH9/f318e3p6enl5eXl5eHh4eHh4eHh4eHl5eHh4eXl5ent8fHx9fX5+fn+Af3+AgIGCg4WGhoaHh4iIiIeGhYWEhIWGh4eHiIqLjIyNjYyNjIyMjY2MjIuKiYiIiIiIiImJiYqLi4yLi4qJiYiHh4eGhoeHiImJiYiHh4eGhoaGhoaHiImKioqKiomJiIiHh4aGhYWFhoeHhoWEhIODg4SFhYaHh4eHhoaGhoaFhoaFhYSDgYB/f3+AgIGCgoGCgoGBgH58enh4eHl6ent8fH19fX19fn5+f4CBgYGBgIB/fXx8fHx8fHt7enp5eHh4eHh4eHh5eXp5eXp6ent8fH1+f39/f39+fn19fHt7e3t7fH5/gIB/fn18e3t7e3p5eHh3eHh4eHl6e3x9fHt6eHd2dnZ3dnVzcnFvbm1sbGxucXN1d3h5ent7e3t7enp7fHx8fHt6ent8fHx7enl5enp6e3t7fH5+f4B/f35/f4CAgH59fHx9foCBgoKCgoGAfn19fX19fX18fHt6enp5eXh3d3d3d3Z2dnV1dXV2d3h5ent7fX1+fn18e3p5eXl4eHh5eXh4eHl5eXl4eHh5enp5eHd2dnV1dXV1dnd3eHl5ent8fX5/f317enh4d3d3d3h4eXl4eHl6fH6AgYKCgYKCgoKEhYaGhoaGhYSEhIWGh4iIh4aEg4KBgYKDg4SFhoeIh4eGhYSEhYaIiIiJiYiIiImKi4yMjIyMjY2NjY2NjIuLi4qKi4uLi4uMjI2Njo2NjY+QkZKSkpGQkI+Pj4+PkJCQkZGQj46OjYyLioiIh4eHh4eHhoaGhoeIiYmIiIiIiIiHhoWEhISFhYSCgYGBgYGBgoOEhISEhISEhIOCgH99fXx7fH1+f3+AgIB/f39+fn18fH1+f39/fnx6d3VycXFxc3V3d3h4d3d4eHl5enp7e3x8fX1+f39+fXx8fH18e3t6ent8fX5/gIGBgoKDg4KBgICAgYKCgoGAf35+fn59fHp5eHd2dnZ2d3h4d3Z2dXV2dnh5enp7e3p7e3t7e3p6e3p7e3t7e3t7e3x9fn5+f4CBg4ODgoKBgoOFhoaHh4iIiYmJiYmJioqKioqKiYiHh4aFhYSDgoKCgYB/f3+BgoSGiIiJiIaEgoGBgYGCgoGBgH9/gIGCg4OCgoKCgYB+fX19fn9/f39+fn5+f4CBgoKCgoKBgICBgYGAgH9+fn19fHt7enl3dnV1dXV1dHNzc3NzcnJyc3R1dnd4eHh4eHd2dnd5e3x9fXx7enl5eXl5e3x9fX19fHx8fX5/f4CAf35+f4CBgoKDg4OCgoKDhISEhYSEg4ODg4SEg4OEhIODhIWFhYWFhoaHiImJiomJiYmJiYiIiIiKi42NjYuKiIiIiIiIh4aFhIOCgoKCg4OEhISDgoGBgIGBgoKCgYGBgoGBgoKDg4OCgH9+fX1+gIOFh4eGhYOCgYCAgICBgIB/f319fHx9fn9/f357d3Rxb29vb3Byc3Nzc3Nzc3NzcXBubWxramloZ2hpamtsbW5ucHJ0dnl6enp5eHh4eXt9f4CBgoOFh4mKiomHhoSDg4KBgYCAgIGCg4SEhISDgoGAfnx6enl5eXt8fHx6eXh3eHl7fHx8fHx7e3t7fHx7enp6e3x+fn+Af35+fXx7e3p6enp6e3t8fX1+f35+f35+fn5/gIKEhYaGhYWEhISDgoOEhYWGh4eIiIiHh4eIh4eHhoaFg4KBgICAgH9/f4CAgICAgICAgH9+fX19fX5/f3+AgYKDhIaHh4iIiIiIiImJiYmIiIeGhYWEhISDg4OCgoKBgoOEhYWFhIOCgoKDhISEhISEg4KBgICBgYKDgoGBgYCAgYODgoKBgYGBgoODgoKAf35+fX19fX5+fn5+f39+fn59fXx8fHx7fHx9fn+BgYKCg4KBgYGAf39/fn5+fn+AgoSFhoiJiYiIiIeIiImJiYmKi4yMjIyNjY2Mi4uMjY2OjYyMi4uLi4qKiomIh4aGh4eJiouLi4uKiYiIiIiIiYmKiouMjY6Ojo6Ojo6Ojo2Mi4qJiouMjY6Oj4+OjoyLioqJiYiHhoWDgoGBgoSFhoaGhYSDgoKBgoKDg4KBgH9+fX18e3t8fH19fn59fX19fX18fX19fXx7enp6enp6enp5eHd3d3d4eXh4eHd2dXR0dHR0c3Jxb25ubm1tbW1tbm1tbGtra2xsbWxsbGxra2tra2trbG1tbGtqamlqamtsbW5vcHFxcnJzdHZ4eXp6eXl4dnV0cnJycnJxcXFxcXFycnNzc3Nzc3R2d3l5eXl6eXl5enp5eXp6enp7fH1+fn+BgoODg4OCg4OEhYWGhoaFhIOCgYGCgoKCgoKDhIWFhoaGhYWEg4KBgH9+fn5/f4CAgYGCg4SEhISDg4OEhIWFhISDg4ODhIWFhISDgoKBgYKCg4SGh4eIiYqKiomJiIeGhYWFhYWFhYWFhYSDg4ODhIWFhYWFhYWEhISDg4KCgoODg4SEhISEg4KCgoGBgYGBgX9/f3+AgYKDhYaHhoWEg4OCgoKCgoKCgoKDhIWFhYWFhISEhISEg4OCg4SFh4iJiouMjIyLi4uKioqLi4uMjY2NjY2NjY2Ojo2Mi4uLioqJiIiIiYiIiIiIiIeHh4aFhISEhISEhYWEhISEhISEg4KCgYGBgoOFhoaGhYOCgoKBgoODhIaGh4eGhoWEhISFhYaHhoaGhoiJioqJiIiHhoaGhYaGhoaHh4iIiYmJiYiHhoWEg4OCgYCAgYGBgoKCgYGBgH9+fXt6eXd2dXRzc3JzdHNzcnJzc3Nzc3JxcHBxc3NycW9ta2ppaGhpaWpqamtsbW5tbGxsa2ppaWlpamttbm9vb29ub29wcXFycnNzc3R1dXZ3eXp7e3p6eXl4d3d3d3h5eXl6ent7fH1+f3+AgICBgYGCgoKCgYGAgYGAgIGBgYKCgoOEhYaGhoeJiYqKioqLi4yMjIyMi4qKioqJiYqLjI2Oj5CRkZGRkI+OjYuKiomJioqKioqJiYqKioqJiIaGhoaFhISEg4KBgH5+fn19fX5/gIB/fn18e3p5eXh3d3d3eHh4eHd3dnV0c3FwcG9vb3BwcXJycnN1dnZ3dnZ1dHJxcXBwb29vb3Bwb25vb29vb3Byc3R0c3Nzc3R0dHR0c3NycnJycXFxcnN0dXV1dnd4eHl5enp6enp6ent8fHt7e3p6ent8fHx8fHx8fHx8fH1+gIGCg4KCgoGBgICBgYKDhYaIioqLjIuLi4qKi4uMjI2Njo6Oj5CQkJGRkZCQj4+Ojo+Rk5SWlpaWl5eXl5eXlpWVlJOTkpKSkZGRkJCQj4+Ojo2NjYyMi4qKiYmKioqKi4uKiYmIiIiIiIeHhoaHh4aGhoaFhYSFhYSEg4KBgICBgYKDg4ODg4ODgoGBgoKCgoGBgYGBgYGBgYGBgYCAgH9/f39/gICAgYGBgYKBgoKCgYB/f35+fn+AgICAgICAgYGBgYGBgYKCgoODg4OCg4OEhYWFhYWFhISEhISEhISDhIODg4KCgoKCgoODg4SEhISFhYWGhoaFhYWFhYaHh4iJiYmJiIiHh4aGhoWEhISEhYaGh4eHh4aGhYSEhYaGhoeHh4eGhoWFhYWGhoeHiIiIiIiHhoaFhYSCgH9/f39/f3+AgYGAgH9+fX18e3p5d3Z1dXR0c3Nzc3JxcHBvb3BxcnN0dHNycG5tbGtra2tsbGxsbGxtbW1ubm5ub3Bvb29ubWxrampqa2xtbm9wcXFxcXFycnN0dXV1dXV1dHNzdHR0dHV1dnZ2dXRzcnJyc3N0dHV1dXZ3eHp7fH19fHt6eXl4eXl7fX5/f39+fn18fHx8e3t9fX+AgYKDg4OCgYB/fn1+foCBgoKDhYWGhYSCgYGBgYGCgoOEhYaHiIiIiIeHhoWFhYSEhoeIioqKiYmHhoaGh4iJiYiHhoaGhYSEg4OEg4KBgH9/gIGBgoODhISEhISEg4KBgH9+fX1+f4CCg4ODhISDg4ODgoKCgoKCgoGBgICAgICAf39/f39+fn5+fn9+fX18e3t6enl4eHh5enp6ent8fX19fX19fXx8fHx7e3x9fX5+f4CBgYCAgH9/f359fHx8fH1+fn5/f4CBgYKCgoODg4ODg4ODg4ODgoKCgYKDg4SFhoeHiIiJiYmLjIuMjIyMjIyLi4uLi4yMjIyMjIuLi4uKioqKioqKioqLi4uKioqKioqJiYqKiYiIiIiIiYmIiIiIiIiHiIiHiIiJiouLi4yNjY6Oj5CRkZKSk5OTkpCPjYyLi4uLi4qJiIeHhoaFhYSDgoKCgoKBgYCAf35+fX18e3t8fHx8fHt6enp5eHd1dXV2dnZ2dnZ2dnZ2d3d3d3Z1dHNzc3Jzc3Nzc3RzcnFxcHBwcHBvb29vb25vb3Bwb29vbm9wcHFxcXBxcnN0dXV1dXR1dXZ2d3d2d3d3d3d4eXl6ent7e3t6enl5enp7fHx8fX1+fn19fX19fn5/f39/f4CAgYKDg4ODg4ODgoKCgoKCgoOEhYWFhoaFhISEg4ODgoKDhISFhYWFhYaHh4eHh4aHh4iIiYmJiIeGhYU=" );

    public SItop( int x, int y )
    {
        this( x, y, defaultAlive, defaultAliveAlt, defaultDestroyed, defaultSound, defaultDestroySound, defaultValue );
    }

    public SItop( int x, int y, int value )
    {
        this( x, y, defaultAlive, defaultAliveAlt, defaultDestroyed, defaultSound, defaultDestroySound, value );
    }

    public SItop( int x, int y, Image alive, Image aliveAlt, Image destroyed, AudioClip sound, AudioClip destroySound, int value )
    {
        this.alive = alive;
        this.aliveAlt = aliveAlt;
        this.destroyed = destroyed;
        xPosition = x;
        yPosition = y;
        this.sound = sound;
        this.destroySound = destroySound;
        this.value = value;
        super.init();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void paintComponent( Graphics g )
    {
        if ( sound != null && playSound )
        {
            sound.play();
            sound.loop();
            playSound = false;
        }
        g.drawImage( visual, xPosition, yPosition, null );
    }

}
